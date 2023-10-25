import java.util.Scanner;

public class pre_geometrico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora Geométrica");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Seleccione la figura (1/2/3): ");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                calcularCirculo();
                break;
            case 2:
                calcularCuadrado();
                break;
            case 3:
                calcularTriangulo();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        input.close();
    }

    public static void calcularCirculo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        double diametro = 2 * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Diámetro del círculo: " + diametro);
    }

    public static void calcularCuadrado() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = input.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    public static void calcularTriangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Área del triángulo: " + area);
    }
}