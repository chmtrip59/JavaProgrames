public class SumAvg2DArray {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Sum and Avg of 2D Array\n");

        int[][] numArr = ArrayUtility.input2DArray();

        double AvgArr = avg(numArr);
        double SumArr = sum(numArr);
        System.out.println("Your sum and avg of array is: "+ "Sum:- "+SumArr+" & Avg:- "+AvgArr);

    }
    public static double avg(int[][] numArr ){
        if(numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols ;
        return sum(numArr)/size;
    }
    public static double sum(int[][] numArr ){
        double sum = 0; 
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
