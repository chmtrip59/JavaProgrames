public class myPattern {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            int k = 0;
            while(k <= 5-i){
                System.out.print("  ");
                k++;
            }
            int j = 0;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


