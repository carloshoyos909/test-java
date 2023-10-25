import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class parcial_2 {

    private static final String[] AÑOS_FABRICACIÓ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] POTENCIA = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner pantalla = new Scanner(System.in);
        int añoFabricación;
        String potencia;
        String letraT;
        int número;

        // Solicitamos los datos al usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = pantalla.nextLine();
        System.out.println("Ingrese su identificación: ");
        String identificacion = pantalla.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = pantalla.nextInt();
                

        while (true) {

        // Solicitamos los datos al usuario
        
        System.out.println("Ingrese el año de fabricación del vehículo: ");
        añoFabricación = pantalla.nextInt();

        System.out.println("Ingrese la potencia del vehículo en caballos de fuerza: ");
        potencia = pantalla.nextLine();

        System.out.println("Ingrese el número de vehículo: ");
        número = pantalla.nextInt();

        // Generamos la letra T
        letraT = generarLetraT(añoFabricación, potencia);

        // Generamos la matrícula
        String matrícula = añoFabricación + potencia + letraT + String.format("%03d", número);

        // Imprimimos la matrícula
        System.out.println("La matrícula del vehículo es: " + matrícula);
    }
}

    private static String generarLetraT(int añoFabricación, String potencia) {

        // Obtenemos la primera letra de la matrícula
        String letra = añoFabricación.substring(0, 1);

        // Si la primera letra es Y o Z, entonces la letra T es la misma que la potencia
        if (letra.equals("Y") || letra.equals("Z")) {
            return potencia;
        } else {
            // Si la primera letra no es Y o Z, entonces la letra T es una letra aleatoria
            return AÑOS_FABRICACIÓ[new Random().nextInt(AÑOS_FABRICACIÓ.length)];
        }
    }
}
