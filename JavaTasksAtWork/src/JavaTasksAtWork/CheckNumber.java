package JavaTasksAtWork;
 import java.util.Scanner;
public class CheckNumber {
	
	boolean checkNumber(int num) {
		while(num>=1) {
			if(num%2 ==0) num = num/2;
			else {
				if(num ==1) return true;
				else return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the required number for Check");
		Scanner scann = new Scanner(System.in);
		int p = scann.nextInt();
     
	CheckNumber res1 = new CheckNumber();
	
	System.out.println(res1.checkNumber(p));
	scann.close();
	}

}
