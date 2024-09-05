  public class fibonacciSeries {
  public static void main(String args[]){

    int n1=0;
    int n2=1;
    int n3;
    int count= 20;


    System.out.print(n1+" "+n2);// Prints 0 and 1


    //Loop will starts from 2 bcz we have 0 and 1 already 
    for(int i = 2; i<count;++i){

        n3 = n1+n2;// Here n3 value is 1 = 0+1
        System.out.print(" "+n3);//prints 1

        n1=n2;//Here n1 =1 bcz of n1=n2
        n2=n3;//Here n2 = 1 bcz n3=1 in above code
        //Now loop begins

    }


  }
    
}