package JavaTasksAtWork;

import java.util.Scanner;

public class SumOfFactorial {
           static int fibonacciSeries(int n) {
        	  
        	   if(n<=0) return 0;
        	   else if(n==1) return 1;
        	   else return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        	  
           }
           
          static int findFactorial(int givenNumber) {
        	   int fact =1;
        	   while(givenNumber>0) {
        		   fact = fact*givenNumber;
        		   givenNumber--;
        	   }  
        	   //System.out.println("fact "+fact);
        	   return fact;
        	  
           }
           
       static int    findSum(int number){
    	   int total =0;
    	   for(int i=0;i<=number-1;i++) {
    		 
    	int fibResult =	  fibonacciSeries(i);
    //	System.out.println(fibResult);
    int factorialResult =	findFactorial(fibResult);
  //  System.out.println("factorialResult "+factorialResult);
    total = total+factorialResult;
    		
    	   } 
    	//  System.out.println(total);  
    	   return total;
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the Number");
   Scanner input1 = new Scanner(System.in);
   int number = input1.nextInt();
   //int num =	fibonacciSeries(number);
  int result = findSum(number);
System.out.println(result);
	}

}
