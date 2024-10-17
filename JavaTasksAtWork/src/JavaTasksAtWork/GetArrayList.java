package JavaTasksAtWork;

import java.util.Arrays;
import java.util.TreeSet;

public class GetArrayList {
    static   void getArrayList(String[] a1) {
    	   TreeSet<String> ArrayElements = new TreeSet<String>(Arrays.asList(a1));
    	   String [] updatedArray = new String [a1.length];
    	   int length = updatedArray.length;
    	   int mid =0;
    	   if(length%2==0) mid = length/2;
    	   else mid = length/2+1;
    	   System.out.println(mid);
    	   
    	   int index =0;
    	   for(int j=0;j<mid;j++) {
    		  
    	   }
    	 //  System.out.println(updatedArray.length);
    	   
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] Array = {"Chandrast", "Indra","Mahindra","Ravindra","Chakri"};
     getArrayList(Array);
	}

}
