import java.util.Scanner;

public class sumAllOddNum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to odd Sum");

        System.out.println("Please enter your Number: ");

        int num = input.nextInt();

        int sum = oddSum(num) ;

        System.out.println("OddSUm till " + num + " is: "+ sum);
    }

        public static int oddSum(int num){

            int sum = 0;

            int i = 1;

            while( i <= num){

                sum = sum + i ;

                i = i + 2 ;
            }

            return sum;

        }
}
