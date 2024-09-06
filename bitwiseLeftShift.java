import java.util.Scanner;

public class bitwiseLeftShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to showcasing Bitwise << operator");
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int res =  num << 1 ;//multiply the number with 2 or power of the  input number will be 2 . If we left shift 4 digits then power will be 4 to any number 
        System.out.println("Your result is :"+res+" for "+num+" given number" );
    }
}
