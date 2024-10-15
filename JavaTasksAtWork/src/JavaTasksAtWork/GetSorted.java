package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.Collections;


public class GetSorted {
	ArrayList <Integer> getSorted(int[] inputArr){
		 ArrayList <Integer> sortedArray = new ArrayList <Integer>();
		 for(int i=0;i<inputArr.length;i++) {
       	  int p = inputArr[i];
       	  String str  = Integer.toString(p);
       	//  System.out.println(str);
       	  char []charArr = str.toCharArray(); 
       	  String str2 = "";
       	  for(int j=charArr.length-1;j>=0;j--) str2 = str2+charArr[j];
         int num = Integer.parseInt(str2);
         sortedArray.add(num);
         }
		 Collections.sort(sortedArray);
		 return sortedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = {12,23,96,45,91,34,29};
        //  ArrayList<Integer> sortedArray = new ArrayList <Integer>();
//         
          
          GetSorted arraySorted = new GetSorted();
          
          
       System.out.println(arraySorted.getSorted(arr));
          
          
	}

}
