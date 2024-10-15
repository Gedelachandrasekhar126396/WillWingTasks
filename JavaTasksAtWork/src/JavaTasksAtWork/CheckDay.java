package JavaTasksAtWork;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class CheckDay {

	 String getDayofWeek(String dateFormat, String Date){
		 String dayOfWeek = "";
		try {
			
			Date inputDate = new SimpleDateFormat(dateFormat).parse(Date);
			Calendar calendar =  Calendar.getInstance();
			String []dateArray = Date.split("/");
			if(dateArray.length==3 ) {
			calendar.set(Integer.parseInt(dateArray[0]),Integer.parseInt(dateArray[1])-1,Integer.parseInt(dateArray[2]));
			int day = calendar.get(calendar.DAY_OF_WEEK);
			
			      
			
			
			System.out.println(calendar.get(Calendar.YEAR));
			System.out.println(calendar.get(Calendar.MONTH));
			System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
			switch(day) {
			case 1 : dayOfWeek= "SUNDAY";
		    break;
			case 2 : dayOfWeek= "MONDAY";
			break;
			case 3 : dayOfWeek = "TUESDAY";
			break;
			case 4 : dayOfWeek = "WEDNESDAY";
			break;
			case 5 : dayOfWeek = "THURSDAY";
			break;
			case 6: dayOfWeek = "FRIDAY";
			break;
			case 7 : dayOfWeek = "SATURDAY";
			break;
			default : dayOfWeek = "Invalid Input";
			}
			 }
			 else {dayOfWeek = "Invalid";}
			
		}
			
		catch(ParseException e) {
			//System.out.println(e.getMessage());
			dayOfWeek =  "Invalid";
		}
		return dayOfWeek;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckDay requiredDay = new CheckDay();
System.out.println("Enter the date of birth");
Scanner  givenDate = new Scanner(System.in);
     String dateStr = givenDate.nextLine();
    String str=  requiredDay.getDayofWeek("dd/mm/yyyy",dateStr);
    if(str == "Invalid") System.out.println("Please do enter the date in the following DD/MM/YYYY format only");
    else   System.out.println("He/She was born on "+str);
	}

}
