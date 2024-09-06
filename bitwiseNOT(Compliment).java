
import java.util.Scanner;

class bitwiseNOT {//Also known as BitWse Compliment
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to showcasing Bitwise Not/Compliment '~' operator");
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int res = ~ num ;
        System.out.println("Your result is :"+res+" for "+num+" given number" );
    }
}
// Litle complicated to understand