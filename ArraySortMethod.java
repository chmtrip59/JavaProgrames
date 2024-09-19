import java.util.Arrays;

public class ArraySortMethod {
    public static void main(String[] args) {
        
        int[] Arr = {54,48,78,15,48,45,-15,-17,0,1,2,5,7,8,9};

        Arrays.sort(Arr);

        int i= 0;
        while(i < Arr.length){
            System.out.print(Arr[i]+" ");
            i++;
        }
    }
}
