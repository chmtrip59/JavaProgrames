import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = input.nextInt();
       
        int add = a+b;
        int sub = a+b;
        int mult = a+b;
        float div = a+b;
        float mod = a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);

        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);
    }
}
