import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
    

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the Factorial number: ");
        int num;
        num = input.nextInt();
        int fact=1;
        
        

        for(int i = 1;i<=num;i++){

            fact = fact*i;
        }

        System.out.println(fact);
    }
}
