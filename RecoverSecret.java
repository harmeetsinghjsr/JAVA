import org.json.JSONObject;
import org.json.JSONException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class RecoverSecret {
    private static final BigInteger PRIME = new BigInteger("208351617316091241234326746312124448251235562226470491514186331217050270460481");
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RecoverSecret <shares.json>");
            return;
        }
        
        try {
            // Read JSON file
            String jsonContent = readFile(args[0]);
            JSONObject json = new JSONObject(jsonContent);
            
            int n = json.getInt("n");
            int k = json.getInt("k");
            JSONObject sharesObj = json.getJSONObject("shares");
            
            // Convert shares to BigInteger
            Map<Integer, BigInteger> shares = new HashMap<>();
            for (String key : sharesObj.keySet()) {
                int participantId = Integer.parseInt(key);
                String shareValue = sharesObj.getString(key);
                shares.put(participantId, parseShareValue(shareValue));
            }
            
            // Recover secret
            BigInteger recoveredSecret = recoverSecret(shares, k);
            System.out.println("Recovered Secret: " + recoveredSecret);
            
            // Find likely incorrect shares
            List<Integer> incorrectShares = findIncorrectShares(shares, k, recoveredSecret);
            if (!incorrectShares.isEmpty()) {
                System.out.println("Likely incorrect shares:");
                for (int id : incorrectShares) {
                    System.out.println("  Participant ID: " + id);
                }
            }
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static String readFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
        }
        return content.toString();
    }
    
    private static BigInteger parseShareValue(String value) {
        value = value.trim();
        
        if (value.startsWith("gcd(") && value.endsWith(")")) {
            return calculateGCD(value);
        } else if (value.startsWith("lcm(") && value.endsWith(")")) {
            return calculateLCM(value);
        } else {
            // Try to parse as hex first, then decimal
            try {
                if (value.matches("[0-9A-Fa-f]+")) {
                    return new BigInteger(value, 16);
                } else {
                    return new BigInteger(value);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid share value: " + value);
            }
        }
    }
    
    private static BigInteger calculateGCD(String expression) {
        String[] parts = expression.substring(4, expression.length() - 1).split(",");
        List<BigInteger> numbers = new ArrayList<>();
        
        for (String part : parts) {
            numbers.add(new BigInteger(part.trim()));
        }
        
        BigInteger result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = result.gcd(numbers.get(i));
        }
        
        return result;
    }
    
    private static BigInteger calculateLCM(String expression) {
        String[] parts = expression.substring(4, expression.length() - 1).split(",");
        List<BigInteger> numbers = new ArrayList<>();
        
        for (String part : parts) {
            numbers.add(new BigInteger(part.trim()));
        }
        
        BigInteger result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = lcm(result, numbers.get(i));
        }
        
        return result;
    }
    
    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }
    
    private static BigInteger recoverSecret(Map<Integer, BigInteger> shares, int k) {
        if (shares.size() < k) {
            throw new IllegalArgumentException("Not enough shares to recover secret");
        }
        
        // Use Lagrange interpolation
        BigInteger secret = BigInteger.ZERO;
        List<Integer> participantIds = new ArrayList<>(shares.keySet());
        
        for (int i = 0; i < k; i++) {
            BigInteger numerator = BigInteger.ONE;
            BigInteger denominator = BigInteger.ONE;
            
            for (int j = 0; j < k; j++) {
                if (i != j) {
                    numerator = numerator.multiply(BigInteger.valueOf(-participantIds.get(j)));
                    denominator = denominator.multiply(BigInteger.valueOf(participantIds.get(i) - participantIds.get(j)));
                }
            }
            
            BigInteger lagrangeCoeff = numerator.multiply(denominator.modInverse(PRIME)).mod(PRIME);
            secret = secret.add(shares.get(participantIds.get(i)).multiply(lagrangeCoeff)).mod(PRIME);
        }
        
        return secret;
    }
    
    private static List<Integer> findIncorrectShares(Map<Integer, BigInteger> shares, int k, BigInteger expectedSecret) {
        List<Integer> incorrectShares = new ArrayList<>();
        
        for (int participantId : shares.keySet()) {
            Map<Integer, BigInteger> testShares = new HashMap<>(shares);
            testShares.remove(participantId);
            
            if (testShares.size() >= k) {
                try {
                    BigInteger testSecret = recoverSecret(testShares, k);
                    if (!testSecret.equals(expectedSecret)) {
                        incorrectShares.add(participantId);
                    }
                } catch (Exception e) {
                    incorrectShares.add(participantId);
                }
            }
        }
        
        return incorrectShares;
    }
} 