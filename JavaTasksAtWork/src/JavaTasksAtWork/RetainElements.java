package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;

public class RetainElements {
    void removeElements() {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> Array1 = new ArrayList<String>(Arrays.asList("Tata","Mahindra","Maruthi","Audi",
    		"BMW","Jagvar"));
   
    
    ArrayList<String> Array2 = new ArrayList<String>(Arrays.asList("BMW","Jagvar","SKODA","Audi",  
    		"Landrover"));
   
    
   Array1.retainAll(Array2);
   System.out.println(Array1);
 //  System.out.println(Array2);
	}

}
