public class Diagonal2DArray {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Sum of Diagonal in 2D Array:\n");

        int[][] numArr = ArrayUtility.input2DArray();

        long sumOfDiagonal = sumOfDiagonal(numArr);

        System.out.println("Sum of Diagonal is : "+sumOfDiagonal);

    }

    public static long sumOfDiagonal(int[][] numArr ){
        long leftSum = sumOfLeftDiagnoal(numArr);
        long rightSum = sumOfRightDiagnoal(numArr);
        long sum = leftSum + rightSum ;
        if(numArr.length % 2 != 0){
            int ind  = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;

    }
    public static long sumOfLeftDiagnoal(int[][] numArr ){
        long sum = 0 ;
        int i = 0;
        while(i < numArr.length){
            sum = sum + numArr[i][i];
            i++;
        }
        return sum;

    }
    public static long sumOfRightDiagnoal(int[][] numArr ){
        long sum = 0 ;
        int i = 0;
        while(i < numArr.length){
            int col = numArr.length - 1 - i ;

            sum = sum + numArr[i][col];
            i++;
        }
        return sum;

    }
}
