

public class ArraySumAvg {
    public static void main(String[] args) {
       
        System.out.println("Welcome to SUma and Avg: ");
     
        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        double avg = avg(numArray);

        System.out.println("Sum of the numbers is: " +sum);
        System.out.println("Average of the numbers is: " +avg);

    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static double  avg(int[] numArray){//before double there is long for which we type cast the long nto int
        double sum = sum(numArray);

        return (sum/numArray.length);
        // return (int) (sum/numArray.length);
    }
}
