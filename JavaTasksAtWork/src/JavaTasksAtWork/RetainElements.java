package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainElements {
    List<String> retainElements(List<String> List1,List<String> List2) {
    	List1.retainAll(List2);
    	return List1;
    //	System.out.println(List1);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> Array1 = new ArrayList<String>(Arrays.asList("Tata","Mahindra","Maruthi","Audi",
    		"BMW","Jagvar"));
   
    
    ArrayList<String> Array2 = new ArrayList<String>(Arrays.asList("BMW","Jagvar","SKODA","Audi",  
    		"Landrover"));
   
 
    
   RetainElements retain = new RetainElements();
  System.out.println( retain.retainElements(Array1,Array2));;
	}

}
