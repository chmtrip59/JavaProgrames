
import java.util.Scanner;

public class Array2DSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to 2D search\n");

        int[][] numArr = ArrayUtility.input2DArray();

        System.out.println("Now enter the number you want to search: ");

        int num = input.nextInt();

        boolean isFound = search(numArr, num);

        if (isFound) {

            System.out.println("Your number was found");

        } else {

            System.out.println("Your number was not found");

        }

    }

    public static boolean search(int[][] numArr, int num) {
        int i = 0;
        while (i < numArr.length) {
            int j = 0;

            while (j < numArr[i].length) {
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
