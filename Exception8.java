import java.io.*;
public class Exception8 {
    public static void main(String[] args) {
        try {
            FileOutputStream f=new FileOutputStream("abcd.txt");
            String content="Hello World";
            f.write(content.getBytes());
            // byte arr[]=content.getBytes();
            // f.write(arr);
            f.close();
            System.out.println("File Written Successfully");
            FileInputStream file=new FileInputStream("abcd.txt");
            int ch=file.read();
            while(ch!=-1) {
                System.out.print((char)ch);
                ch=file.read();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}