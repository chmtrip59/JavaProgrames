import java.util.Scanner;

public class myDeleteArray{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);// Taking input from user to delete the number

        System.out.print("Welcome to myDelete Araay\n ");

        int[] numArr = ArrayUtility.inputArray();// Take the elements of an array from the user 

        System.out.print("Enter the number you want to remove: ");

        int numToDelete = input.nextInt();//take the number to delete

        int[] newArr = deleteNumber(numArr, numToDelete);//call the method to place the number inside the newArr
        
        System.out.println("Here is your new Array");

        ArrayUtility.displayArray(newArr); //diaplay the array traversal 

    }

    public static int[] deleteNumber (int[] numArr , int numToDelete){// method to delete the number input by the user 


        int occ = OccurencesArray.noOfOccurrence(numArr, numToDelete);//calling the occurrence method

        if(occ == 0){ // Here we are checking whether if there is no occurrence of a number then return the same numArr
            return numArr;
        }
        int newSize = numArr.length - occ;  // now here we are getting the size of the an array 

        int[] newArr = new int[newSize]; // created new array 

        int i = 0 , j = 0 ;

        while(i < numArr.length){

            if(numArr[i] != numToDelete){

                newArr[j] = numArr[i];

                j++;

            }
            i++;

        }

        return newArr;
    }

}