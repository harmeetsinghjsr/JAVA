import java.io.FileOutputStream;
public class Exception4 {
    public static void main(String[] args) {
        // try{
        //     FileOutputStream fos = new FileOutputStream("abc.txt");
        //     fos.write(65);
        //     fos.close();
        // }catch(Exception e){
        //     e.printStackTrace();
        try(FileOutputStream fos = new FileOutputStream("abc.txt")){
            String txt="Hello World";
            byte[] b=txt.getBytes();
            fos.write(b);
            System.out.println("Data written to file");
        }catch(Exception e){
            e.printStackTrace();
            //System.out.println("Exception caught");
        }
    }
}