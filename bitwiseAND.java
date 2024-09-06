
import java.util.Scanner;

public class bitwiseAND {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Showcasing BitWise & operator\n");
        System.out.print("Please Enter the first Number: ");
        int f = scan.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int s = scan.nextInt();
        
        int result = f & s ;
        System.out.println("Result is : " + result);
    }
}
