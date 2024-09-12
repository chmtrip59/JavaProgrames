
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Prime Number checker: ");
        System.out.println("Please enter the number: ");
        int num = in.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){

            System.out.println("Entered number is a Prime Number. ");
        }else{
            System.out.println("Entered number is not a Prime Number. ");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
