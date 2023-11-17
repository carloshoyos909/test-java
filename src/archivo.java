import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

public class archivo {

    public double generarID(int cantidadID) {

       // String[] ID = new String[cantidadID];
         Random random = new Random();
        //FileWriter fw = new FileWriter("BaseDeDatos.txt");
        //PrintWriter pw = new PrintWriter(fw);


            double ID = random.nextDouble();
    
            while (ID < 1000000) {
                ID = random.nextDouble();
            }
    
            return ID;
        
    }

    public static void main(String[] args) {
        try {
            archivo archivo = new archivo();

            // Genera 10 IDs y los escribe en el archivo BaseDeDatos.txt
            for (int i = 0; i < 10; i++) {
                double ID = archivo.generarID(10);

                // Escribe el ID en el archivo
                FileWriter fw = new FileWriter("BaseDeDatos.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(ID);
                pw.close();
            }

        } catch (Exception e) {
            System.out.println("hay un error general: " + e);
        }
    }   

}