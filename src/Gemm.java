import java.util.Scanner;

/*
Write a program in Java to input
5 numbers from keyboard and find their sum and average.
*/
public class Gemm {
public static void main(String[]args) {
    double avg = 0.0 ;

    Scanner input = new Scanner(System.in);
    int y;
    System.out.println("Input the number: ");
    y = input.nextInt();
    int sum = 0;


    int k = 0;
    for (k = 1; k <= y; k++) {
        sum += k;
        // int total = sum;
        //multiplication *= k;

        System.out.println("The first n natural number: " + k);

        // finding the sum of all the value of k;
        //y += 1;
        //  System.out.println("The multiplication of y is: " + multiplication);
        //System.out.println( "The Sum of y is: " + sum  );
    }

    System.out.println("The Sum of y is: " + sum);
    System.out.println("avg = "+ sum/y);
}
//public static double avg(int sum, int y){
//     sum = 0;
//    y = 0;
//   double avg =  sum/y;
//   System.out.println("avg = "+ avg);
//    return avg;
//}



}
