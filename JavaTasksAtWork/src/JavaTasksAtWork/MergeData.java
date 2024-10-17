package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MergeData {
	
	
   static Character[] mergeData(ArrayList <Character> List1, ArrayList<Character> List2) {
    TreeSet<Character> filter = new TreeSet<Character>(List1);
        for(int i=0;i<List2.size();i++) filter.add(List2.get(i));
    //System.out.println(filter);
        Character[] charArray = filter.toArray(new Character[0]);
    	return charArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Character> Array1 = new ArrayList <Character>(Arrays.asList('a','d','c','p','b','h'));
  ArrayList <Character> Array2 = new ArrayList<Character>(Arrays.asList('t','l','b','h','r','e'));
  
 Character [] resultantArray = mergeData(Array1,Array2);
     for(int i=0;i<resultantArray.length;i++) System.out.println(resultantArray[i]);

 // System.out.println(Array2);
	}

}
