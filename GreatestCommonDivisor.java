
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Welcome to GCD calculator: ");
        System.out.print("Please enter the first number: ");
        int first = num.nextInt();
        System.out.print("Please enter the second number: ");
        int second = num.nextInt();
        int yourGcd = myGCD(first, second);
        System.out.println("Your GCD number is: " + yourGcd);
    }

    public static int myGCD(int num1 , int num2){
        int myGCD = 1;
        int i = 2 ;
        int least = least(num1 , num2);
        while(i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                myGCD = i ;
            }
            i++;
        }
        return myGCD;

    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
