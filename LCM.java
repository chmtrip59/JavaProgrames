
import java.util.Scanner;

public class LCM{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator: ");
        System.out.print("Please enter the first number: ");
        int first = num.nextInt();
        System.out.print("Please enter the second number: ");
        int second = num.nextInt();
        int yourLcm = myLCM(first, second);
        System.out.println("Your LCM number is: " + yourLcm);
    }
    public static int myLCM(int first , int second){
        int i = 1;
        while(true){//(i <= second)
            
            int myNumber = first * i ;

            if(myNumber % second == 0){
                return myNumber ;
            }
            
            i++ ;

        }
       // return 0 ;//Unreacheable In case loop become infinite loop 
    }
}