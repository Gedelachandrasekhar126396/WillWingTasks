package JavaTasksAtWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ModifyArray {
	int [] modifyArray(int[] array){
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
		   for(int i=0;i<array.length;i++) map.put(array[i],i);
		   int []array2 = new int[map.size()];
		   int index =0;
		 
		   for(Integer key: map.keySet()) {
			   array2[index] = key;
			  // System.out.println(key);
			   index++;
		   }
		   return array2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] = {7,2,5,3,6,8,9,2};
   

 

ModifyArray modify = new ModifyArray();
  int arr[] = modify.modifyArray(array);
  for(int i=0;i<arr.length;i++) {
	  for(int j=i+1;j<arr.length;j++) {
		  if(arr[j]>arr[i]) {
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
		  }
	  }
  }
for(int j=0;j<arr.length;j++) System.out.println(arr[j]);
	}
 



}
