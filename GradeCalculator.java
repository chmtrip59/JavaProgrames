
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        

        Scanner in =new Scanner(System.in);

        System.out.println("Welcome to Grade calculator: ");

        System.out.println("Please emter your %tage : ");

        float per = in.nextFloat();
    
        if(per >=90){
            System.out.println("You have got A ");
        }else if (per >= 75){
            System.out.println("You have got B ");

        }else if (per >= 60){
            System.out.println("You have got C");
        }else if (per >= 30){
            System.out.println(" You have got D");
        }else {
            System.out.println("You have failed the test ");
        }
    
    }

}
