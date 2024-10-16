package JavaTasksAtWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayofWeek {

    public static  void getDayofWeek(String dateString, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false); // Set to false for strict date parsing
        try {
            Date date = sdf.parse(dateString);
            // Ensure the original string matches the formatted date
            boolean isValid = dateString.equals(sdf.format(date));
            if(isValid) {
            	//System.out.println("Entered a Valid Date");
            	Calendar calendar = Calendar.getInstance();
            	String [] dateSplit = dateString.split("-");
            	int day = Integer.parseInt(dateSplit[0]);
            	int month = Integer.parseInt(dateSplit[1]);
            	int year = Integer.parseInt(dateSplit[2]);
                 calendar.set(year, month-1,day);
                 int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
                 String dayOfWeek = "";
                 switch(dayWeek) {
                 case 1:
                	 dayOfWeek = "SUNDAY";
                	 break;
                 case 2:
                	 dayOfWeek = "MONDAY";
                	 break;
                 case 3:
                	 dayOfWeek = "TUESDAY";
                	 break;
                 case 4:
                	 dayOfWeek = "WEDNESDAY";
                	 break;
                 case 5:
                	 dayOfWeek = "THURDAY";
                	 break;
                 case 6:
                	 dayOfWeek = "FRIDAY";
                	 break;
                 case 7:
                	 dayOfWeek = "SATURDAY";
                	 break;
                 } System.out.println(dayOfWeek);
                 
            } else {
            	System.out.println("Please Enter a valid date");
            }
        } catch (ParseException e) {
        	System.out.println("Please Enter a valid date");
        }
    }

    public static void main(String[] args) {
        
        String dateToCheck = "16-10-2024";  
        String format = "dd-MM-yyyy";

        getDayofWeek(dateToCheck,format);
          
        }
    
}

