package JavaTasksAtWork;
import java.util.ArrayList;
import java.util.Scanner;



public class CheckNumber2 {
	
	boolean checkNumber2(int n1) {
		 ArrayList<Integer> numList = new ArrayList<>();
		    ArrayList<Integer> numList2 = new ArrayList<>();
		         while(n1>0) {
		    	int p = n1%10;
		    	numList.add(p);
		    	n1 = n1/10;
		    }
		    for(int j=numList.size()-1;j>=0;j--) {
		    	numList2.add(numList.get(j));
		    }
		   System.out.println(numList2);
		 
		    boolean flag = true;
		   for(int j=1;j<numList.size();j++) {
			   if(numList2.get(j-1)>numList2.get(j)) flag = false; 
		   }
		   
		return flag;
	}
	
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the required Number");
     Scanner getNum = new Scanner(System.in);
     
     int n1 = getNum.nextInt();
    
     CheckNumber2 func = new CheckNumber2();
     System.out.println(func.checkNumber2(n1));
     
     getNum.close();
	}
	

}
