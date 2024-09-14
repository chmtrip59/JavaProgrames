
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        // printRightHalfPyramid(rows);
        // printReverseRightHalfPyramid(rows);
        printReverseLeftHalfPyramid(rows);
    }
    public static void printReverseLeftHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
             int j = 0;   //this loop prints spaces
             while(j < rows-1){
                System.out.print("  ");
                j++;
             }

            //This loop prints stars
           int i = 0;
           while( i <= (maxRows-rows)){
            System.out.print("* ");
            i++;
           }
            System.out.println(" ");
            rows--;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows--;
        }
    }

    public static void printRightHalfPyramid(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows++;
        }
    }
}
