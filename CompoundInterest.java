import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Principle amount in rupees ");
        double principle = scan.nextDouble();
        System.out.println("Please enter the Rate : ");
        double rate = scan.nextDouble();
        System.out.println("Please enter the time :");
        double time = scan.nextDouble();

        double CompoundInterest = principle * Math.pow((1+ rate /100), time);

        System.out.println("Compound interest is : " + CompoundInterest);
}
}