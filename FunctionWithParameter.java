public class FunctionWithParameter {
    
    public static int mySum(int num1,int num2){
        // System.out.println(num1);
        // System.out.println(num2);
        // int sum = num1 + num2 ;
        // return sum ;// can write as given below
        return num1 + num2 ;
    }

    
    
    
    public static void main(String[] args) {
        
        // int num = mySum(10, 10);
        // System.out.println(num);
        // OR

        System.out.println(mySum(4, 5));// can call function directly in sout 
        System.out.println(mySum(10, 7));
        System.out.println(mySum(45, 55));
        System.out.println(mySum(45, 25));
    }
}
