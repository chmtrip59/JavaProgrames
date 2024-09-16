import java.util.Scanner;

 class LogicalOperator {
     public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator: ");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a Female: (true/false) ");
        boolean isFemale = input.nextBoolean();


        if(age < 5){
            System.out.println("You got 75% discount");
        } else if (isFemale){
            System.out.println("You got 50% discount");
        } else if (age > 60 && !isFemale){
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You got no discount");
        }





     }
}
