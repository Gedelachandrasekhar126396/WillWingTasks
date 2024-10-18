package JavaTasksAtWork;

import java.util.Scanner;

public class SumOfFactorial {
           static int fibonacciSeries(int n) {
        	   
        	   if(n<=0) return 0;
        	   else if(n==1) return 1;
        	   else return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        	  
           }
          static void fibSum(int num) {
        	 int s1 =0;
        	  for(int i=num;i>=1;i--) {
        		  int  sum = fibonacciSeries(num-1)+fibonacciSeries(num-2);
        		  s1 = s1+sum;
        	  }
        	
        	System.out.println(sum);
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
