//import java.util.Scanner;

public class Calculadora {

    static int suma(int a, int b) {
        return a + b;
    }

    static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
       // Scanner pantalla = new Scanner(System.in);

        try {
            System.out.println("La suma es: " + suma(2, 5));
            System.out.println("la multiplicacion es: " + multiplicacion(2, 5));
        } catch (Exception e) {
            System.out.println("hay problema en el codigo: ");
        }

    }

}
