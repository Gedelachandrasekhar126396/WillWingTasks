package JavaTasksAtWork;

import java.util.Scanner;

public class SumOfNumbers {
	int calculateSum(int num) {
		int sum =0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter thr required Number");
 
 Scanner scann = new Scanner(System.in);

       int p = scann.nextInt();
       SumOfNumbers s1 = new SumOfNumbers();
		
		System.out.println("Sum after condition is "+s1.calculateSum(p));
		scann.close();
	}

}
