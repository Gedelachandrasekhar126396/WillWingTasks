package JavaTasksAtWork;

import java.util.Scanner;



public class ModifyNumber {
	int modifyNumber(int num) {
		String str = Integer.toString(num);
		char[] array = str.toCharArray();
		StringBuffer str2 = new StringBuffer();
		for(int j=1;j<array.length;j++) str2.append(Math.abs(array[j-1]-array[j])); 
		str2.append(array[array.length-1]);
	      String str3 = str2.toString();
	      int finalOutput = Integer.parseInt(str3);
	  //    System.out.println(str2);
		return finalOutput;
	}
	public static void main(String[] args) {
		System.out.println("Enter the input");
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      ModifyNumber givenNumber = new ModifyNumber();
     int output = givenNumber.modifyNumber(num1);
     System.out.println(output);
	}

}
