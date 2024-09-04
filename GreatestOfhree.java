
import java.util.Scanner;

public class GreatestOfhree {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter First numbers: ");
        double num1 = in.nextDouble();
        System.out.print("Please Enter Second numbers: ");
        double num2 = in.nextDouble();
        System.out.print("Please Enter Three numbers: ");
        double num3 = in.nextDouble();

        if(num1 >= num2 && num1 >= num3 ){
            System.out.println(num1 + " is the greatest of three numbers ");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the greatest of three numbers ");
       
        }else{
            System.out.println(num3 +" is the greatest of three numbers");
        }



    }
}
