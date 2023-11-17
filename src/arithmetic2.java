import java.util.Scanner;

public class arithmetic2 {

    public static void main(String[]args){

        Scanner ask = new Scanner(System.in);

        double firstnumber, secundnumber;
        double answersum, sudtraction_answer, multiplication_answen, splitanswen;
        String yes="s";

        do {
            
            System.out.println("digite el primer numero: ");
            firstnumber= ask.nextDouble();

            System.out.println("digite el segundo numero: ");
            secundnumber=ask.nextDouble();
            
            answersum = firstnumber + secundnumber;
            sudtraction_answer = firstnumber - secundnumber;
            multiplication_answen = firstnumber * secundnumber;
            splitanswen = firstnumber/secundnumber;

            System.out.println(answersum);
            System.out.println(sudtraction_answer);
            System.out.println(multiplication_answen);
            System.out.println(splitanswen);


            System.out.println("quiere reiniciar (s/n)? ");
            yes= ask.next5();

        } while (yes.equals("s"));
        
        
        ask.close();

              
     
    }
}