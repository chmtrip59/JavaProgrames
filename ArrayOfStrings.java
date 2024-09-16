public class ArrayOfStrings {
    public static void main(String[] args) {
        
        String[] str = new String[4];
        str[0] = "My string";


        String[] newStr = {"My name " , " Is " , "Golu." };

        System.out.println(newStr.length);
        System.out.println(str.length);

        int i = 0;
        while(i < newStr.length){
            System.out.println("My string is: " +newStr[i]);
            i++;
        }
    }
}
