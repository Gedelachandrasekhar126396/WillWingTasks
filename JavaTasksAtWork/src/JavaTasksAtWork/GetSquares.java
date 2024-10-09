package JavaTasksAtWork;

import java.util.ArrayList;
import java.util.HashMap;

public class GetSquares {
       void getSquares(int[] arr) {
    	   HashMap <Integer,Integer>squaresMap = new HashMap<Integer,Integer>();
    	   for(int j=0;j<arr.length;j++) {
    		   int p = arr[j];
    		  squaresMap.put(p,p*p) ;
    	   }
    	   System.out.println(squaresMap);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] array = {1,2,3,4,6};
     
     
     GetSquares squares = new GetSquares();
      squares.getSquares(array);
	}

}
