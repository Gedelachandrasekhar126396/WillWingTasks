package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GetStates {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String combined = "tamilnadu||chennai-karanataka||bengaluru";
           HashMap<String, String> stateCapitalCombo = new HashMap<String,String>();
         //  String[] stateCapital = combined.split("||");
           ArrayList<String> listArr = new ArrayList<String>();
           
           String []divideState = combined.split("-");
           for(int j=0;j<divideState.length;j++) {
        	 //  System.out.println(divideState[j]);
        	   String StateCapitalCombo = divideState[j];
        	   StringTokenizer divideCapital = new StringTokenizer(StateCapitalCombo,"||");
        	   while (divideCapital.hasMoreTokens()) {
        		  String token2 = divideCapital.nextToken();
        		   String token = divideCapital.nextToken();
        		   stateCapitalCombo.put(token2,token);
        	   }
           }
         
      
    System.out.println(stateCapitalCombo);
	}
	

}
