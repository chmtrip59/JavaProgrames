

public class ArraySumAverage {
    public static void main(String[] args) {
        
        System.out.print("Welcome to Sum and Average Calculator using Array:\n" );

        int[] myArr1 = ArraytoUtility.inputArray();

        double Sum = SumOfArray(myArr1);

        double Avg = AverageOfArray(myArr1);
        System.out.println("The sum of the given number is: "+Sum);
        System.out.println("The average of the given number is: "+Avg);

    }
    public static double SumOfArray(int[] myArr1){

        int sum = 0 ;//Accumulator of sum of numbers 

        int i = 0;

        while(i < myArr1.length){

            sum += myArr1[i];

            i++;

        }
        return sum;
    }
    public static double AverageOfArray(int[] myArr1){

        

       double Avg = SumOfArray(myArr1)/myArr1.length ;


        return Avg;
    }
}
