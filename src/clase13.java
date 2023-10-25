
public class clase13 {

    public static double division(double a, double b) {
        try {
            if (a == 0 && b == 0) {
                System.out.println("no se puede dividir entre 0!! ");
                throw new ArithmeticException("No se puede dividir entre 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

            System.out.println("problema: " + e);
        }
        return a / b;

    }

    public static void main(String[] args) {

        try {

            System.out.print(division(10, 0));

        } catch (Exception error) {
            System.out.print("hay un problema |");
        }

    }

}