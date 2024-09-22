
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number of Element: ");
        int size = in.nextInt();// getting input from the user

        int[] nums = new int[size]; // Create a new array to decalre the size of an array
        

        int i = 0;
        while (i < size) {
            System.out.print("Please enter the element no." + (i+1) + ": ");
            nums[i] = in.nextInt();//iterate the nput of a number from the user
            i++;            
        }
        return nums;
    }

    public static int[][] input2DArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = in.nextInt();// getting input from the user
        System.out.print("Please Enter the number of columns: ");
        int columns = in.nextInt();// getting input from the user
        int[][] numArray = new int[rows][columns]; // Create a new array to decalre the size of an array
        

        int i = 0;
        while (i < rows) {
            int j = 0;
            while(j < columns){

                System.out.print("Please enter the rows no." + (i+1) + ", columns: "+ (j+1) + " :");
                numArray[i][j] = in.nextInt(); //iterate the nput of a number from the user
                j++;
            }
            i++;            
        }
        return numArray;
    }

    public static void displayArray(int[] numArr){
        int i = 0;

        while(i < numArr.length){

            System.out.println(numArr[i] + " ");

            i++;
        }
        System.out.println();
    }
}
