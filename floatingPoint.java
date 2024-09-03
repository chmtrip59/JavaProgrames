import java.util.Scanner;

public class floatingPoint{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first floating Number: ");
        double first = in.nextDouble();
        System.out.println("Please enter Second floating Number: ");
        double second = in.nextDouble();
        
        double mul = first*second;

        System.out.println("\n Result: "+ mul);
    }

}
