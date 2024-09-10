
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digits: ");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int  sum = sumOfDigit(num);
        System.out.println(sum);
    }

    public static int sumOfDigit(int num){
       int sum  = 0 ;//Accumulator 
       while (num > 0){
        sum = sum + (num % 10);
        num = num / 10 ;
       }
       
        return sum;
    }
}
