
import java.util.Scanner;

public class myReturnFunction {

    public static void myGreet() {
        System.out.println("Welcome to the sum calculator: ");
    }

    public static int myNumberInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number : ");

        int inputNumber = input.nextInt();

        return inputNumber;
    }

    public static void main(String[] args) {

        myGreet();

        int num1 = myNumberInput();

        int num2 = myNumberInput();

        int mySum = num1 + num2;

        System.out.println("Sum of the given numbers is : " + mySum);
    }
}
