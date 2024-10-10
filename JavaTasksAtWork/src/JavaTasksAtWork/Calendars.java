package JavaTasksAtWork;

import java.util.Calendar;
import java.util.Scanner;

public class Calendars {
  String	getDayofWeek( String Date){
	  String [] splitDate = Date.split("/");
	  int monthDay  = Integer.parseInt(splitDate[0]);
	  int month = Integer.parseInt(splitDate[1]);
	  int year = Integer.parseInt(splitDate[2]);
	  Calendar calendar = Calendar.getInstance();
	  calendar.set( year,month-1,monthDay);
	  int day = calendar.get(calendar.DAY_OF_WEEK);
	  String weekDay = "";
	  
	  switch(day) {
	  case 1 : 
		  weekDay = "Sunday";
		  break;
	  case 2 : 
		  weekDay = "Monday";
		  break;
	  case 3 :
		  weekDay = "Tuesday";
		  break;
	  case 4: 
		  weekDay = "Wednesday";
		  break;
	  case 5:
		  weekDay = "Thursday";
	      break;
	  case 6: 
		  weekDay = "Friday";
		  break;
	  case 7 :
		  weekDay = "Saturday";
		  
	  }
		return weekDay;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please Enter the date in dd/mm/yyyy foramt");

  Scanner  givenDate = new Scanner(System.in); 
       String date = givenDate.nextLine();
       
      Calendars getCalendar = new Calendars();
   String weekday =   getCalendar.getDayofWeek(date);
   System.out.println("He/She was born on "+weekday);
	}

}
