import java.util.*;
interface Woods{
    void thick(int len1);
    void thin(int len2);
    int a=10;
}
interface Metal{
    void hard();
    void soft();
}
class Sandalwood implements Woods,Metal{
    public void thick(int len1){
        System.out.println(len1);
        System.out.println("Thick wood");
    }
    public void thin(int len2){
        System.out.println(len2);
        System.out.println("Thin wood");
    }
    public void hard(){
        System.out.println("Hard metal");
    }
    public void soft(){
        System.out.println("Soft metal");
    }
}
class Interface{
    public static void main(String[] args)
    {
        Sandalwood obj = new Sandalwood();
        obj.thick(20);
        obj.thin(21);
        System.out.println(obj.a);
        obj.hard();
        obj.soft();

    }
}