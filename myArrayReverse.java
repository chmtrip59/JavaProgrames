public class myArrayReverse {
    public static void main(String[] args) {
       
        System.out.println("Welcome to Array Reverse:\n");

        int[] numArr = ArrayUtility.inputArray();

        ArrayReverse(numArr);

        System.out.println("Here is your array reverse:");

        ArrayUtility.displayArray(numArr);
    }

    public static void ArrayReverse(int[] numArr){

        int i = 0;

        while(i < numArr.length/2){

            int temp = numArr[i];

            numArr[i] = numArr[(numArr.length - 1) - i];
            numArr[(numArr.length - 1) - i] = temp;

            i++;

        }




    }
}
