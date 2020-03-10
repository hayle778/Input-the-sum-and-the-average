import java.util.Scanner;

/*
Write a program in Java to input
5 numbers from keyboard and find their sum and average.
*/
public class Gemm {
public static void main(String[]args) {

      Scanner input = new Scanner(System.in);
        int y;
      System.out.println("Input the number: ");
       y = input.nextInt();

       int sum = 0;
       int k ;
       for( k = 1; k <= y; k++){
           sum += k;
         // int total = sum;
           System.out.println("" + k);

         // finding the sum of all the value of k;
      //y += 1;

       }
   //    System.out.println( "The Sum of y is: " + k );

    System.out.println( "The Sum of y is: " + sum  );

}
}
