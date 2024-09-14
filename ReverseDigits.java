
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Reverse Factory!");
        System.out.println("Please enter your number:");
        int originalNumber = scan.nextInt();

        int reversedNumber = myReverseMethod(originalNumber);
        System.out.println("Your reversed number is: " + reversedNumber);

    }

    public static int myReverseMethod(int n) {
        int myNum = 0;
        while (n > 0) {
            int placeHolder = n % 10;
            myNum = myNum * 10 + placeHolder;
            n /= 10;
        }
        return myNum;
    }
}
