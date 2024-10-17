package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ModifyElement {
	
	static boolean StringCompare(String s1, String s2) {
		
		   String s3= s1.toLowerCase();
		   String s4 = s2.toLowerCase();
		     boolean compareBoolean = s3.matches(s4);
		   //  System.out.println(compareBoolean);
		return compareBoolean;
	}
	
	
	
	
	static ArrayList<String> modifyElement(ArrayList<String> List1, String str) {
		
		ArrayList <String> filteredList = new ArrayList<String>(); 
		for(int i=0;i<List1.size();i++) {
			String listString = List1.get(i);
		boolean response = StringCompare(listString,str);	
			if(response == true) {
				int p = List1.get(i).length();
				int mid = p/2;
				if(p%2==0) {
					String filteredString = List1.get(i).substring(0,mid);
					filteredList.add(filteredString);
				//	System.out.println(filteredString);
				} else {
					String filteredString = List1.get(i).substring(0,mid+1);
					filteredList.add(filteredString);
					//System.out.println(filteredString);
				}
			}
			else   filteredList.add(List1.get(i));
		}
	//	 System.out.println(str);
		 return filteredList;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> elements = new ArrayList<String>(Arrays.asList("Chandrast", "Indra","Mahindra","Ravindra"));
    String reqString = "INDRA";
 elements =   modifyElement(elements,reqString);
 System.out.println(elements);
	}

}
