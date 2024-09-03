import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 1st side of the rectangle in cms: ");
        float rect1 = in.nextFloat();
        System.out.print("Please enter 2nd side of the rectangle in cms: ");
        float rect2 = in.nextFloat();
        System.out.print("Please enter 3rd side of the rectangle in cms: ");
        float rect3 = in.nextFloat();
        System.out.print("Please enter 4th side of the rectangle in cms: ");
        float rect4 = in.nextFloat();

        float Perimeter = rect1+rect2+rect3+rect4;

        System.out.println("\n Final Perimeter of the Rectangle is  : " +Perimeter);
    }
}
