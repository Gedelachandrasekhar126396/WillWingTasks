package JavaTasksAtWork;

import java.util.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GetStates {
	static HashMap<String,String> getStates(String combined, String c1,String c2){
	
         HashMap<String, String> stateCapitalCombo = new HashMap<String,String>();
    
         
         
         String []divideState = combined.split(c1);
         for(int j=0;j<divideState.length;j++) {
      	 //  System.out.println(divideState[j]);
      	   String StateCapitalCombo = divideState[j];
      	   StringTokenizer divideCapital = new StringTokenizer(StateCapitalCombo,c2);
      	   while (divideCapital.hasMoreTokens()) {
      		  String token2 = divideCapital.nextToken();
      		   String token = divideCapital.nextToken();
      		   stateCapitalCombo.put(token2,token);
      	   }
         }  
        
         return stateCapitalCombo;
	}
	public static void main(String[] args) {
		
		 HashMap<String, String> result = new HashMap<String,String>();
		 
	result =	getStates("tamilnadu||chennai-karanataka||bengaluru","-","||"); 
	System.out.println(result);

	}
	

}
