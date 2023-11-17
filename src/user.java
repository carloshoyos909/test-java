import java.util.Scanner;

public class user {

    public static void main(String[] args) {

        Scanner screen = new Scanner(System.in);

        final String user = "carlos";
        String putuser;
        final String password = "#santa@";
        String putpassword;
        
             do {
                 //solicito el usuario
              System.out.println("usuario: ");
             putuser=screen.nextLine();

             do {
                System.out.println("ingrese la contraseña: ");
                putpassword=screen.nextLine();
             } while (putpassword.equals(password)==false);

        } while (putuser.equals(user)==false);
            System.out.println("usuario y contraseña correcta <3");
            screen.close();
/* 
        do {
            //ingresar la contraseña
            System.out.println("ingrese la contraseña: ");
            putpassword=screen.nextLine();

        } while (putpassword.equals(password)==false);
        System.out.println("contraseña conrrecta<3");
        screen.close();
*/

    }
}