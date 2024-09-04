import java.util.Scanner;

public class EvenOddWithValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Invalid number. Please enter a non-zero value.");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

