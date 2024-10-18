package JavaTasksAtWork;

import java.util.Scanner;

public class FibonacciSeries {
           static int fibonacciSeries(int n) {
        	   int num =n;
        	   if(n==0) return 0;
        	   else if(n==1) return 1;
        	   else return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        	  
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the Number");
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();
	int num =	fibonacciSeries(number);
	System.out.println(num);
	}

}
