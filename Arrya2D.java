public class Arrya2D {
    public static void main(String[] args) {
        
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 1232;
        arr[1][1] = 11;
        arr[2][2] = 12;
        
        // System.out.println(arr[1][1]);
        // System.out.println(arr[0][1]);

        int[][] newArr = {{1,2,3},{3,4,5},{4,5,7}};
        int[][] newArr1 = {{1,2,3},{3,4},{4,5,7}};

        System.out.println(newArr.length);
        System.out.println(newArr[0].length);
        System.out.println(newArr1.length);

        //Traversal of 2D Array

        int i =0;
        while(i < newArr.length){
            int j = 0;
            while(j < newArr[i].length){
                System.out.print(newArr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }

        
        int i1 =0;
        while(i1 < newArr1.length){
            int j1 = 0;
            while(j1 < newArr1[i1].length){
                System.out.print(newArr1[i1][j1]+" ");
                j1++;
            }
            System.out.println();
            i1++;
        }

    }
}
