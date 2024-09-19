public class isArraySorted {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Program");

        int[] numArr = ArrayUtility.inputArray();

        boolean isIn = isIncreasing(numArr);
        boolean isDe = isDecreasing(numArr);

        if(isIn || isDe){
            System.out.println("Your Array is sorted");
        }else{
            System.out.println("Your Array is not sorted");
        }
    }


    public static boolean isIncreasing(int[] numArr){
        int i =1;

        while(i <numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean isDecreasing(int[] numArr){
        int i =1;

        while(i <numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }
}
