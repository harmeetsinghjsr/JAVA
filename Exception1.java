public class Exception1 {
    public static void main(String ar[])
    {
        try{

        
        int a=2,b=0;
        double d=a/b;
        
        System.out.println(d);

    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Exception");
    }
    catch(Exception e)
    {
        System.out.println("Exception");
    }
    finally
    {
        System.out.println("Finally block");
    }
}
}