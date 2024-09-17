public class myMinMaxArray {
    public static void main(String[] args) {

        System.out.println("Welcome to Max and Min Calc: ");

        int[] numArr = ArrayUtility.inputArray();

        int max = numArr[0];
        int min = numArr[0];

        int i = 1;

        while (i < numArr.length) {
            if (max < numArr[i]) {

                max = numArr[i];

            }
            if (min > numArr[i]) {

                min = numArr[i];

            }
            i++;
        }

        System.out.println("Min of an Array is: "+min);
        System.out.println("Max of an Array is: "+max);

    }
}
