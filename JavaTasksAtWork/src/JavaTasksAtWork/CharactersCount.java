package JavaTasksAtWork;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class CharactersCount {
	HashMap<Character, Integer> CharactersCount(char[] charArray) {
		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++) {
	         char p = charArray[i];
	      
	         boolean flag = false;
	      
	        	 for(Character k: charCount.keySet()) {
	        		 if(p==k) flag = true;
	         }
	        	 if(flag==true) charCount.put(p,charCount.get(p)+1);
	        	 else charCount.put(p, 1);
	     
	        
	         
	   }
		return charCount;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Word");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char [] arr1 = input.toCharArray();
		// TODO Auto-generated method stub
//  char []array = {'C','H','A','N','P','A','D','A','A','L'};
  
  // HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
   CharactersCount count = new CharactersCount();
   System.out.println(count.CharactersCount(arr1));
   

	}

}
