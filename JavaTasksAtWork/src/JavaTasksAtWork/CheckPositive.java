package JavaTasksAtWork;

import java.util.Scanner;

public class CheckPositive {
	static boolean checkPositive(String givenString) {
		char[] charArray = givenString.toCharArray();
		boolean flag = true;
		for(int i=1;i<charArray.length;i++) {
			int v1 = (int) charArray[i-1];
			int v2 = (int) charArray[i];
		///	System.out.println(v1+" "+v2);
			int value = v2-v1;
			if(value<0) {
				flag = false;
				break;
			}
			
		} return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a Word");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
 System.out.println(checkPositive(str)); 
	}

}
