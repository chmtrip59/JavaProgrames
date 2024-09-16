public class ArrayTraversal {
    public static void main(String[] args) {

        int[] Arr = new int[50000000];//1st Method of declaration of An Array
        Arr[400] = 203;//index = 400 and value in this index is 203;
        Arr[400] = 45;//Redeclaration of an array is also possible

        //Once if we declared the size of an array then it can not redeclare again
        System.out.println(Arr[400]);
        int[] myArr = {10,20,30,40};//Declaration of An Array method 2

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);

       //Another method of declare an Array
        int[] myAr ={};
        myAr[1]=15;
        myAr[2]=14;
        myAr[3]=11;
        myAr[4]=12;

        int index = 1;
        while(index <= myAr.length){
            System.out.println(myAr[index]);//This method of printing the values of an array is known as Array Traversal
            index++;
        }



    }
}
