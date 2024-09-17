
import java.util.Scanner;

public class OccurencesArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to number of occurrence finder: ");

        int[] myArr = ArrayUtility.inputArray();

        System.out.println("Please enter the number to find the occurence of a number");

        int numb = input.nextInt();

        int occurence = noOfOccurrence(myArr, numb);

        System.out.println("Your element was found  " + occurence + " times in this array");

    }

    public static int noOfOccurrence(int[] myArr, int numb) {

        int occ = 0;

        int i = 0;

        while (i < myArr.length) {

            if (myArr[i] == numb) {

                System.out.println("Your number is present");
                occ++;
            }

            i++;
        }
        return occ;
    }

}
