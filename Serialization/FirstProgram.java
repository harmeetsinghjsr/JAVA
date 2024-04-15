// package Serialization;
import java.io.*;

public class FirstProgram  implements Serializable{
    String name;
    int rollno;

    public static void main(String[]args){
        FirstProgram obj = new FirstProgram();
        obj.name = "ABCD";
        obj.rollno = 101;
        FirstProgram deserial = null;
        try{
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Added!");

            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            deserial = (FirstProgram)ois.readObject(); 
            fis.close();
            ois.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        if (deserial != null) {
            System.out.println("Content of File: " + deserial.name + ", " + deserial.rollno);
        }
    }
}