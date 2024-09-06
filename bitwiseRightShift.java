import java.util.Scanner;

public class bitwiseRightShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to showcasing Bitwise >> operator");
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int res =  num >> 1 ;// used to divide by 2 to the given number. if we right shift 4 then given number will be divided by 4 
        System.out.println("Your result is :"+res+" for "+num+" given number" );
    }
}
