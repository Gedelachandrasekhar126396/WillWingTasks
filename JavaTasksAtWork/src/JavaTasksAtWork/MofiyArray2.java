package JavaTasksAtWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class MofiyArray2 {
	
	int [] modifyArray(int[] Array) {
		int [] arr = {1,2,3,4};
		 TreeSet<Integer> tree = new TreeSet<Integer>(Comparator.reverseOrder());
		    for(int i:Array) {
		    	tree.add(i);
		    }
		    
		    int[] Array2 = new int[tree.size()];
		    int index = 0;
		    for(int i: tree) {
		    	Array2[index] = i;
		    	index++;
		    }
		    return Array2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] array = {2,1,4,6,4,7,8,9,2,4};
    
//    TreeSet<Integer> tree = new TreeSet<Integer>(Comparator.reverseOrder());
//    for(int i:array) {
//    	tree.add(i);
//    }
    
  //  System.out.println(tree);
    
    MofiyArray2 modifyMethod = new MofiyArray2();
  int []arr =  modifyMethod.modifyArray(array);
        for(int j=0;j<arr.length;j++) System.out.println(arr[j]);
	}

}
