import java.util.Scanner;

public class calculadora2 {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanners = new Scanner(System.in);

        // Imprimir el menú
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        // Leer la opción del usuario
        int opcion = scanners.nextInt();

        // Pedir los números a sumar
        System.out.println("Ingrese los números a sumar: ");
        int[] numeros = new int[2];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanners.nextInt();
        }

        // Realizar la operación
        double resultado = realizarOperacion(opcion, numeros);

        // Imprimir el resultado
        System.out.println("El resultado es: " + resultado);
    }

    // Función para realizar la operación
    public static double realizarOperacion(int opcion, int[] numeros) {
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(numeros[0], numeros[1]);
                break;
            case 2:
                resultado = restar(numeros[0], numeros[1]);
                break;
            case 3:
                resultado = multiplicar(numeros[0], numeros[1]);
                break;
            case 4:
                resultado = dividir(numeros[0], numeros[1]);
                break;
        }

        return resultado;
    }

    // Función para sumar dos números
    public static double sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static double restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static double multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double dividir(int a, int b) {
        return a / b;
    }
}
