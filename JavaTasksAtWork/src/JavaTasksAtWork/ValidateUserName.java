package JavaTasksAtWork;

import java.util.Scanner;

public class ValidateUserName {
  boolean	validateUserName(String Name){
		if(Name.length()>=12) {
			String endPart = Name.substring(Name.length()-4); 
			//System.out.println(endPart.length());
			//System.out.println(endPart);
			boolean result = endPart.equals("_job");
		//	System.out.println(result);
			return result;
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Please Enter the user Name");
      Scanner input = new Scanner(System.in);
      String userName = input.nextLine();
    //  System.out.println(userName);
      
      
      ValidateUserName validate = new ValidateUserName();
   boolean validation =    validate.validateUserName(userName);
     
      
      System.out.println(validation);
	}

}
