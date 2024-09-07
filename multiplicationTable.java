import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to table");
        System.out.println("Please enter the number: ");
        int num = input.nextInt();
        printMulTable(num);

    }

    public static void printMulTable(int num) {
      
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X "+ i + " = " + (num*i));
            i++;
        }

    }
}
