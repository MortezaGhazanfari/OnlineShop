import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Morteza","Ghazanfari",26,"Ingolstadt","m@gmail.com",Rechte.ALLES);
        UtilSerialization.serialization("/Users/mg/IdeaProjects/admin.ser",admin);

        Admin admin1 = (Admin) UtilSerialization.deserialization(   "/Users/mg/IdeaProjects/admin.ser");
        System.out.println("Deserialized Admin...");
        System.out.println(admin1);


    }
}