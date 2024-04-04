import java.util.*;
import java.util.*;
interface book
{
    public void Avindr();
    public void classmate();
}
class Copiyan implements book
{
    public void Avindr()
    {
        System.out.println("Tuli bhai ki copy");
    }
    public void classmate()
    {
        System.out.println("high class ka kaaapi hai bhaaai");
    }
}

public class Interface2 {
    public static void main(String[] args)
    {
        Copiyan obj = new Copiyan();
        obj.Avindr();
        obj.classmate();
    }  
}
