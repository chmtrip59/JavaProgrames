// Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.


import java.util.*;   
class pali1  
{  
   public static void main(String args[])  
   {
    String inside ="abc";
    String outside ="";
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Palindrome");
    inside = in.nextLine();
   

    System.out.println();
    

    for(int i = inside.length()-1; i>=0;i--){

        outside = outside + inside.charAt(i);
    }
        if(inside.equals(outside)){
            System.out.println("The input string/number is a palindrome: "+outside);
        }else{
            System.err.println("INput is not palindrome");
        }

   


    // System.out.print(outside);


   }
}  