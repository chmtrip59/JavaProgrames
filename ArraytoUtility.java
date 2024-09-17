
import java.util.Scanner;

public class ArraytoUtility {

    public static int[] inputArray(){

        Scanner input = new Scanner(System.in);
        
        
        
        System.out.print("Please enter the size of an Array: " );
        
        int size = input.nextInt();
        
        int[] myArr = new int[size];
        
        int i = 0;
        
        while(i < myArr.length){
            System.out.println("Please enter the number "+(i+1)+" :");
            
            myArr[i] = input.nextInt();
            
            i++;
            
        }
        return myArr;
    }
}
