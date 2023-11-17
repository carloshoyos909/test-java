import java.util.Scanner;

public class arithmetic {

    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        double firstnumber, secundnumber;
        double answersum, sudtraction_answer, multiplication_answen, splitanswen;
        

        System.out.println("ingrese el primer numero: ");
        firstnumber=ask.nextDouble();

        System.out.println("ingrese el segundo numero: ");
        secundnumber=ask.nextDouble();

         ask.close();

        answersum = firstnumber + secundnumber;
        sudtraction_answer = firstnumber - secundnumber;
        multiplication_answen = firstnumber * secundnumber;
        splitanswen = firstnumber/secundnumber;

        System.out.println(answersum);
        System.out.println(sudtraction_answer);
        System.out.println(multiplication_answen);
        System.out.println(splitanswen);
            
    }
}