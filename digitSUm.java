
import java.util.Scanner;

public class digitSUm {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number: ");

        int myNum = in.nextInt();

        int mySum = myMethod(myNum);
        System.out.println(mySum);
    }

    public static int myMethod(int myNum){

        int mySum = 0; // Accumulator 

        while(myNum > 0){
            int digit = myNum % 10;
            mySum += digit;
            myNum = myNum / 10 ;

        }
        return mySum;

    }
}
