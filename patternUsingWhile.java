
public class patternUsingWhile {

    public static void printFirstPattern() {
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");

        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows++;
        }
    }

    public static void main(String[] args) {
        printFirstPattern();
    }
}
