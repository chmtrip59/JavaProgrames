
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Base of a trangle in cms : ");
        double Base = in.nextDouble();
        System.out.println("Please enter the Height of a trangle in cms : ");
        double Height = in.nextDouble();

        double Area = 0.5 * Base * Height;// (Base*Height)/2

        System.out.println("Area of a triangle is: " +Area+" square cm");
    }
}
