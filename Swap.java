import java.util.*;//Import Scaaner method from util class

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swaping station \n \n");
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the valu of B: ");
        int b = input.nextInt();
        //Main logic to swap the nos.

        int c = a; //the memory location of a is now copied and we can store any no. in it 
        a =  b; //Putting the value of b into a i.e 5
        b = c; //Here the value of c assigned to b i.e 10

        System.out.println("Swapping done...");
        System.out.println("Here is the swaped value of A: "+a);
        System.out.println("Here is the swaped value of B: "+b);
    }
}
