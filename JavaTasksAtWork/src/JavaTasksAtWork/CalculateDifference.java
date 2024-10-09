package JavaTasksAtWork;

import java.util.Scanner;


public class CalculateDifference {
	
int	calculateDifference(int n1){
	
	int s1 =0, s2=0, diff=0;
	for(int i=1;i<=n1;i++) {
		s1=s1+i;
		s2 =s2+ (i*i);
	}
	    diff =  s2 - s1*s1;
	    return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the reqired num");

Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        CalculateDifference reqDiff = new CalculateDifference();
        
       // System.out.println(reqDiff.calculateDifference(num));
        System.out.println(Math.abs(reqDiff.calculateDifference(num)));
        scan.close();
	}

}
