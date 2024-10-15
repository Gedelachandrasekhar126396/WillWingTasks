package JavaTasksAtWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class MofiyArray2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] array = {2,1,4,6,4,7,8,9,2,4};
    
    TreeSet<Integer> tree = new TreeSet<Integer>(Comparator.reverseOrder());
    for(int i:array) {
    	tree.add(i);
    }
    TreeSet <Integer> tree2 = new TreeSet<Integer>();
    System.out.println(tree);
	}

}
