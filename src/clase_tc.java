import java.util.HashMap;
import java.util.Scanner;

public class clase_tc {

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();

        String email, name;

        // Solicitar la clave y el valor al usuario
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Ingrese la dirección de correo electrónico del usuario: ");
        email = pantalla.nextLine();
        System.out.println("Ingrese el nombre del usuario: ");
        name = pantalla.nextLine();

        // Agregar la nueva clave-valor
        users.put(email, name);

        // Recorrer el HashMap
        for (String key : users.keySet()) {
            System.out.println(key + " : " + users.get(key));
        }
    }
}
