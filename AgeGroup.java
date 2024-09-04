
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        

        Scanner in =new Scanner(System.in);

        System.out.print("Welcome to age calculator:\n");

        System.out.print("Please enter your age: ");
        
        float age = in.nextFloat();

        if(age >= 65){
            System.out.println("You are a senior citizen");
        }else if (age >= 20){
            System.out.println("You are an adult");

        }else if (age >= 13){
            System.out.println("You are a teenager");

        }else {
            System.out.println(" You are a child");
        }
    
    }
}
