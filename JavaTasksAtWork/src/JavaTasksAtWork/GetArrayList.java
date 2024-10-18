package JavaTasksAtWork;

import java.util.Arrays;
import java.util.TreeSet;

public class GetArrayList {
    static   String[] getArrayList(String[] a1) {
    	   TreeSet<String> ArrayElements = new TreeSet<String>(Arrays.asList(a1));
    	 //  for(int i=0;i<a1.length;i++) ArrayElements.add(a1[i]);
    	   System.out.println(ArrayElements);
    	   String [] updatedArray = new String [a1.length];
    	   int length = updatedArray.length;
    	   int mid =0;
    	   if(length%2==0) mid = length/2;
    	   else mid = length/2+1;
    	 //  System.out.println(mid);
    	int   index = 0;
    	  for (String ele:ArrayElements) {
    		  if(index<mid) {
    			 // String p = ele;
    			  updatedArray[index] =ele.toUpperCase();
    		  } else updatedArray[index] =ele.toLowerCase();
    		  index++;
    		 
    	  }
    	  return updatedArray;
    	   
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] Array = {"Chandrast", "Indra","Mahindra","Deepak","Deepika","Ravindra","Chakri"};
    String [] outPut =  getArrayList(Array);
    for(int i=0;i<outPut.length;i++) System.out.println(outPut[i]);
	}

}
