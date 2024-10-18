package JavaTasksAtWork;

import java.util.Scanner;

public class FibonacciSeries {
           static int fibonacciSeries(int n) {
        	 
        	   if(n<=0) return 0;
        	   else if(n==1) return 1;
        	   else return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        	  
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the Number");
   Scanner input1 = new Scanner(System.in);
   int number = input1.nextInt();
   int num =	fibonacciSeries(number);
 for(int i=0;i<=number-1;i++) System.out.println(fibonacciSeries(i));
	
	//System.out.println(num);
	}

}
