package JavaTasksAtWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class VotersList {

    ArrayList<String> getDayofWeek(HashMap<String,String> voters) {
        ArrayList<String> eligibleList = new ArrayList<String>();
        for(String perName: voters.keySet()) {
        	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false); 
            String voterdate = voters.get(perName);
         
        	try {
                Date date = dateFormat.parse(voterdate);
                boolean isValid = voterdate.equals(dateFormat.format(date));
                if(isValid) {
                	Calendar calendar = Calendar.getInstance();
                	 Calendar birthCalendar = Calendar.getInstance();
                	 birthCalendar.setTime(date);
                	 int curYear = calendar.get(Calendar.YEAR);
                	 int birthYear =  birthCalendar.get(Calendar.YEAR);
                	 int curMonth = calendar.get(Calendar.MONTH);
                	 int birthMonth = birthCalendar.get(Calendar.MONTH);
                	 int curDay = calendar.get(Calendar.DAY_OF_MONTH);
                	 int birthDay = birthCalendar.get(Calendar.DAY_OF_MONTH);
                	 
                	 int Age = Math.abs(curYear-birthYear);
                	 if((curMonth<birthMonth) || ((curMonth == birthMonth)&& (curDay<birthDay))) {
                		 Age--;
                	 }
                	if(Age>=18) eligibleList.add(perName);
                   //System.out.println(Age);
                } else {
                	System.out.println("Please Enter a valid date");
                }
            } catch (ParseException e) {
            	System.out.println("Please Enter a valid date for "+perName);
            }  
        }  return eligibleList;
        
    }

    public static void main(String[] args) {
        
      
        HashMap<String, String> listOfVoters = new HashMap<String,String>(){{
        	put("Chandra","17/13/2006");  put("Manjula","16/11/1997");
        	put("Ashwini","29/08/2004");
        }};   
     
       
        VotersList findTeam = new VotersList();
        System.out.println(findTeam.getDayofWeek(listOfVoters));
        }
    
}

