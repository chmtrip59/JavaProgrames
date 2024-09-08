
import java.util.Scanner;

public class whileFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number: ");

        int num = in.nextInt();
        long fact = myFactorial(num);
        System.out.println(fact);

    }

    public static long myFactorial(long num){
            if (num == -1){
                return 0;// Condition return
            }
            int i = 1 ;
            long fact = 1;
            while(i <= num ){
                fact = fact * i ;
                 
                i++;

            }
            return fact;
    }
}
