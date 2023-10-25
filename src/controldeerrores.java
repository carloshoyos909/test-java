
public class controldeerrores {

    public static void main(String[] args) {

         int[] vector = new int[3];

        try {


            for (int i = 1; i <= vector.length-1; i++) {

                vector[i] = i * 10;

            }

            System.out.println("mi vector es inicializado");

        } catch (Exception e) {
            System.out.println("hay un error en el codigo <3 |" + e);
            // TODO: handle exception
        }

        for (int elemen : vector) {

            System.out.println(elemen);

        }
    }
}