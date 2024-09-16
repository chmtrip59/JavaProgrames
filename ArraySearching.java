import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,1,4,5,45,48,4,44,444,5,56,98,89898,78};

        System.out.println("Welcome to Array Searching\n");

        System.out.print("Please Enter the number you want to search: ");

        int num = input.nextInt();
        boolean iFind = isFound(arr,num);
        if (iFind){
            System.out.println("Your number is present in Array List");
        }else{
            System.out.println("Your number is not present in Array List");

        }

    }

    private static boolean isFound(int[] arr, int num) {
        int i = 0;
        while(i < arr.length){
            if (arr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }


}
