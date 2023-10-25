import java.util.Scanner;

public class prac_funcion {

    public static void main(String[] args) {
        // Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Imprimir el menú
        System.out.println("¿Qué figura geométrica quieres calcular?");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");

        // Leer la opción del usuario
        int opcion = sc.nextInt();

        // Seleccionar la figura geométrica
        switch (opcion) {
            case 1:
                // Calcular el área y el perímetro del círculo
                calcularCirculo(sc);
                break;
            case 2:
                // Calcular el área y el perímetro del rectángulo
                calcularRectángulo(sc);
                break;
            default:
                // Opción incorrecta
                System.out.println("Opción incorrecta");
                break;
        }

    }

    // Función para calcular el área y el perímetro del círculo
    public static void calcularCirculo(Scanner sc) {
        // Pedir al usuario que introduzca el radio del círculo
        System.out.println("Introduce el radio del círculo: ");
        float radio = sc.nextFloat();

        // Calcular el área del círculo
        double area =  Math.PI * Math.pow(radio, 2);

        // Calcular el perímetro del círculo
        double perimetro =  2 * Math.PI * radio;

        // Imprimir los resultados
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    // Función para calcular el área y el perímetro del rectángulo
    public static void calcularRectángulo(Scanner sc) {
        // Pedir al usuario que introduzca la base del rectángulo
        System.out.println("Introduce la base del rectángulo: ");
        int base = sc.nextInt();

        // Pedir al usuario que introduzca la altura del rectángulo
        System.out.println("Introduce la altura del rectángulo: ");
        int altura = sc.nextInt();

        // Calcular el área del rectángulo
        int area = base * altura;

        // Calcular el perímetro del rectángulo
        int perimetro = 2 * (base + altura);

        // Imprimir los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

}

