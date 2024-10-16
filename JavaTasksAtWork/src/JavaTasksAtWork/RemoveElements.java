package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    List<String> removeElements(List<String> List1, List <String> List2) {
    	List1.removeAll(List2);
    	return List1;
    	//System.out.println(List1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> Array1 = new ArrayList<String>(Arrays.asList("Tata","Maruthi","Reader", 
    		"BMW","Jagvar","Mahindra","SKODA"));
   
    
    ArrayList<String> Array2 = new ArrayList<String>(Arrays.asList("BMW","Jagvar","SKODA","Audi"));
   
    
   RemoveElements performRemove = new RemoveElements();
   System.out.println(performRemove.removeElements(Array1,Array2));
	}

}
