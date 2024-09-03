import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        //si=prt/100
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Principle amount in rupees ");
        double principle = scan.nextDouble();
        System.out.println("Please enter the Rate : ");
        double rate = scan.nextDouble();
        System.out.println("Please enter the time :");
        double time = scan.nextDouble();

        double simpleInterest = (principle * rate * time)/100 ;

        System.out.println("Your Simple interest @ "+rate+" for the time of "+time+" years is : "+simpleInterest);



    }
}
