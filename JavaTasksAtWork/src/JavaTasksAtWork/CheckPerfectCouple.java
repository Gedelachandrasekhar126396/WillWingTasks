package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckPerfectCouple {
    static List<Integer> checkPerfectCouple(HashMap<Integer,String> List) {
    	List<Integer> ids = new ArrayList<Integer>();
    	for(Integer i: List.keySet()) {
    		String str = List.get(i);
    		String coupleSplit[] = str.split("-");
    		char[] couple1 =  coupleSplit[0].toLowerCase().toCharArray();
    		Arrays.sort(couple1);
    		char [] couple2 = coupleSplit[1].toLowerCase().toCharArray();
    		Arrays.sort(couple2);
    		boolean check = Arrays.equals(couple1,couple2);
    		//System.out.println(check);
    		//System.out.println(coupleSplit[0]+" "+coupleSplit[1]);
    		if(check) ids.add(i);
    		
    	}
    	return ids;
    	//System.out.println(ids);
    	 
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> couplesList = new HashMap<Integer,String>();
		couplesList.put(1,"Mahi-Hima");
		couplesList.put(2,"Rinku-Kinru");
		couplesList.put(3,"Rama-Mira");
		couplesList.put(4,"Krish-ShirK");
	//	System.out.println(couplesList);
	List<Integer> perfectCouplesIds= new ArrayList<Integer>();
	
	perfectCouplesIds= 	checkPerfectCouple(couplesList);
	System.out.println(perfectCouplesIds);
	}

}
