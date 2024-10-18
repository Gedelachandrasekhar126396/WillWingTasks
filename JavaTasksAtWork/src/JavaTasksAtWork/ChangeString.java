package JavaTasksAtWork;

import java.util.LinkedHashSet;

public class ChangeString {
          static String alternateResult(String inputStr) {
        	  StringBuffer modifiedStr = new StringBuffer("");
        	  char[] charArray = inputStr.toCharArray();
        	  for(int i=0;i<charArray.length;i++) {
        		  if(i%2==0) modifiedStr.append("*");
        		  else modifiedStr.append(charArray[i]);
        	  }
        	  String afterBuild = modifiedStr.toString();
        	  return afterBuild;
          }
          
          
	static String removeDuplicates(String inputStr) {
		inputStr = inputStr.toLowerCase();
		char[] charArray = inputStr.toCharArray();
		StringBuffer modified = new StringBuffer("");
		LinkedHashSet<Character> uniqueElements = new LinkedHashSet<Character>();
		for(char singleChar: charArray) {
			uniqueElements.add(singleChar);
		}
		for(char ch:uniqueElements) {
			modified.append(ch);
		}
		
		return modified.toString();
		
	}
	
	
	static String changeString2(String inputStr) {
		char [] charArray = inputStr.toCharArray();
		StringBuffer upperLower = new StringBuffer("");
		for(int i=0;i<charArray.length;i++) {
			
			if(i%2==0) upperLower.append(Character.toUpperCase(charArray[i]));
			else upperLower.append(Character.toLowerCase(charArray[i]));
		}
		return upperLower.toString();
	}
 static	String changeString(String str, char p) {
	   p = Character.toUpperCase(p);
		switch(p) {
		case 'A':  String str2 =str+str;
		return  str2;
		
		case 'B': String modify =alternateResult(str);
		return modify;
		case 'C': String modify2 = removeDuplicates(str);
		  return modify2;
		case 'D': String modify3 = changeString2(str);
			return modify3;
		default :
			return "Please choose a valid option";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
	String result =	changeString("chandra",'y');
System.out.println(result);
	}

}
