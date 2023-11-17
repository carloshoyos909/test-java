import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {

        // Declaramos un scanner para leer la entrada del usuario
        Scanner pantalla = new Scanner(System.in);

        // Declaramos una matriz para almacenar las materias
        String[] materias = new String[0];

        // Declaramos una matriz para almacenar las notas
        double[][] notas = new double[0][0];

        // Declaramos una matriz para almacenar los porcentajes
        double[][] porcentajes = new double[0][0];

        // Pedimos al usuario que ingrese la cantidad de materias
        System.out.println("Ingrese la cantidad de materias:");
        int cantidadMaterias = pantalla.nextInt();

        // Ajustamos el tamaño de las matrices
        materias = new String[cantidadMaterias];
        notas = new double[cantidadMaterias][0];
        porcentajes = new double[cantidadMaterias][0];

        // Pedimos al usuario que ingrese el nombre de cada materia
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("Ingrese el nombre de la materia " + (i + 1) + ":");
            materias[i] = pantalla.next();
        }

        // Pedimos al usuario que ingrese la cantidad de notas de cada materia
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("Ingrese la cantidad de notas de la materia " + materias[i] + ":");
            int cantidadNotas = pantalla.nextInt();

            // Ajustamos el tamaño de las matrices
            notas[i] = new double[cantidadNotas];
            porcentajes[i] = new double[cantidadNotas];

            // Pedimos al usuario que ingrese las notas de cada materia
            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " de la materia " + materias[i] + ":");
                notas[i][j] = pantalla.nextDouble();
            }

            // Pedimos al usuario que ingrese los porcentajes de cada nota de cada materia
            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese el porcentaje de la nota " + (j + 1) + " de la materia " + materias[i] + ":");
                porcentajes[i][j] = pantalla.nextDouble();
            }
        }

        // Calculamos la nota final de cada materia
        for (int i = 0; i < cantidadMaterias; i++) {
            double notaFinal = calcularNota(notas[i], porcentajes[i]);

            // Imprimimos la nota final de cada materia
            System.out.println("La nota final de la materia " + materias[i] + " es: " + notaFinal);
        }
    }

    public static double calcularNota(double[] notas, double[] porcentajes) {
        double notaFinal = 0;

        // Multiplicamos cada nota por su porcentaje correspondiente
        for (int i = 0; i < notas.length; i++) {
            notaFinal += notas[i] * porcentajes[i];
        }

        // Dividimos el resultado entre 100
        notaFinal /= 100;

        return notaFinal;
    }
}
