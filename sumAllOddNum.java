import java.util.Scanner;

public class sumAllOddNum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);// input from user

        System.out.println("Welcome to odd Sum");//welcome msg to user

        System.out.println("Please enter your Number: ");//Ask user for the number

        int num = input.nextInt();//Getting the number from user

        int sum = oddSum(num) ;//oddSum with the parameter num called in sum integer

        System.out.println("OddSum till " + num + " is: "+ sum);//Print the output to the user
    }

        public static int oddSum(int num){//Created new method oddSum with parameter

            int sum = 0;

            int i = 1;//initialize the lopp with value 1

            while( i <= num){//loops through until i is equal or less than num

                sum = sum + i ;//sum is store where we store the values assigned to sum with the loop

                i = i + 2 ;// To get the odd number 
            }

            return sum;//return the value to the main function

        }
}
