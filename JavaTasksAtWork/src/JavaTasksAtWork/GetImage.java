package JavaTasksAtWork;


import java.util.Scanner;
public class GetImage {
	String str2 = "";
	String getImage(String s1) {
		char[] chArr = s1.toCharArray();
		StringBuffer str2 = new StringBuffer(s1+"|");
		
		for(int j=s1.length()-1;j>=0;j--) {str2.append(chArr[j]);}
		String str3 = str2.toString();
		return str3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
   Scanner str = new Scanner(System.in);
      String str2 = str.nextLine();
      
      GetImage nStr = new GetImage();
      String reqOut = nStr.getImage(str2);
      System.out.println(reqOut);
      
      
	}

}
