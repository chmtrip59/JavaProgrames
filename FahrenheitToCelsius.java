
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to temperature converter: ");
        System.out.println("Enter your temp in F: ");
        float f = scan.nextFloat();
        float c = ( f- 32 ) * 5/9 ;
        System.out.println("Your Temperature in Celsus is : "+c +" Deg Celsius");



    }
}
