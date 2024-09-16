
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number of Element: ");
        int size = in.nextInt();// getting input from the user

        int[] nums = new int[size]; // Create a new array to decalre the size of an array
        

        int i = 0;
        while (i < size) {
            System.out.println("Please enter the element no." + (i+1) + ": ");
            nums[i] = in.nextInt();//iterate the nput of a number from the user
            i++;            
        }
        return nums;
    }
}
