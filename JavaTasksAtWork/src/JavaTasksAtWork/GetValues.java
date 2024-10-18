package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class GetValues {
	
	
	static TreeSet<Integer> getValues(HashMap<Character,Integer> Map) {
		TreeSet<Integer> sortedIntegers = new TreeSet<Integer>();
		for(Character key: Map.keySet()) {
			//System.out.println(key+" "+Map.get(key));
			sortedIntegers.add(Map.get(key));
		}
	//	System.out.println(sortedIntegers);
		return sortedIntegers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Character, Integer> map = new HashMap <Character,Integer>(){{
    	    
    	    put('p',2);  put('k',10);  put('l',8);  put('h',5); put('c',3);
    	    
     }	};
    
  TreeSet<Integer> resultant = new TreeSet<Integer> (); // getValues(map);
 resultant =  getValues(map);
 System.out.println(resultant);
}
}