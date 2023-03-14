import java.io.*;

public abstract class UtilSerialization {
    public static void serialization(String path, Object obj){
        try
        {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Data is saved!");


        } catch (IOException i) {
            i.printStackTrace();
        }
    };

    public static Object deserialization(String path){
        try
        {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj =  in.readObject();
            in.close();
            fileIn.close();
            return obj;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Admin class not found");
            c.printStackTrace();
            return null;
        }
    };
}
