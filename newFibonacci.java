
import java.util.Scanner;

public class newFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scan.nextInt();
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
       int n1 = 0;
       int n2 = 1;
       int n3;
       System.out.print(n1+" "+n2);//print 0 and 1 first 
       int i = 2;// Now loop begins with 2 because 0 and 1 is already printed

       while(i < num){

        n3 = n1 + n2 ;

        System.out.print(" "+n3);//prints 1

        n1 = n2 ;

        n2 = n3 ;

        ++i;

       }


    }
}
