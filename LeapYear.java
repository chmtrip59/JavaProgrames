
import java.util.Scanner;

public class LeapYear {
    
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter the year to find whether it is a leap year or not: ");

    int leapYear = in.nextInt();

    if(leapYear % 400 == 0 || (leapYear % 4 == 0 && leapYear % 100 != 0)){
        System.out.println(leapYear +" is a Leap Year");
    }else{
        System.out.println("Not a Leap Year");
    }


}


}
