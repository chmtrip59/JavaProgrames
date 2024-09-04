import java.util.Scanner;



public class MyNumberChecker {
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter any number: ");

        double number = in.nextDouble();

        if(number >0){
            System.out.println("Entered Number is Positive ");
        }else if (number < 0){
            System.out.println("Entered Number is Negative ");

        } else{
            System.out.println("Entered Number is Zero ");
        }
    }
}
