public class exception {
    public static void main(String[] args) {
        try {
            int[] n = {1, 2, 3};
            System.out.println(n[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bounds!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }
}