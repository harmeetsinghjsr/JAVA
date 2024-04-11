import java.io.*;
public class Exception6 {
    public static void main(String[] args) throws IOException{
        try {
            FileWriter f=new FileWriter("abcd.txt",true);
            String content="Hello World";
            f.write(content);
            System.out.println("File Written Successfully");
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader=new FileReader("abcd.txt");
            int ch=0;
            while((ch=reader.read())!=-1) {
                System.out.print((char)ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
