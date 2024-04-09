import java.io.*;
public class Exception7 {
    public static void main(String[] args) {
        try {
            BufferedWriter r=new BufferedWriter(new FileWriter("abcd.txt",true));
            String content="Hello World";
            r.write(content);
            r.close();
            System.out.println("File Written Successfully");
            BufferedReader reader=new BufferedReader(new FileReader("abcd.txt"));
            String read=reader.readLine();
            while(read!=null) {
                System.out.println(read);
                read=reader.readLine();
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}q