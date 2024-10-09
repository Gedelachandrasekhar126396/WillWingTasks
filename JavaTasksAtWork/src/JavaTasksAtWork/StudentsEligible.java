package JavaTasksAtWork;

//import java.awt.event.InputEvent;
import java.util.HashMap;
//import java.util.Map.Entry;
import java.util.Scanner;

public class StudentsEligible {

	
	HashMap getStudents(HashMap <Integer,Integer>InputStd) {
		HashMap <Integer,String> EligibleList = new HashMap<Integer,String>();
          
		for(Integer id:InputStd.keySet() ) {
			int marks = InputStd.get(id);
			if(marks>=90) 	
				EligibleList.put(id,"Gold");
			else	if(marks>=80 && marks<90) EligibleList.put(id,"Silver");
			else if(marks>=70 && marks<80) EligibleList.put(id,"Bronze");
			
//			System.out.println(Marks);
//			System.out.println(id+" "+InputStd.get(id));
		}
	

		return EligibleList;
		
		
		
//		return std;
		
	}
	public static void main(String[] args) {
	HashMap <Integer,Integer> Students = new HashMap<Integer,Integer>();
	System.out.println("Enter the Number of Students");
	Scanner stdNum = new Scanner(System.in);
	int studentsCount = stdNum.nextInt();
	for(int i=1;i<=studentsCount;i++) {
		System.out.println("Enter the student Id"+i);
		Scanner stdId = new Scanner(System.in);
		int studentId = stdId.nextInt();
		System.out.println("Enter the student Marks");
		Scanner stdMarks = new Scanner(System.in);
		int studentMarks = stdMarks.nextInt();
		Students.put(studentId, studentMarks);
	}

	//System.out.println(Students);
	
   int num= Students.get(1);
//   System.out.println(num);
   
   StudentsEligible studentsList = new StudentsEligible();
        HashMap filteredList = studentsList.getStudents(Students);
        System.out.println(filteredList);
        
       /* for(Integer i:Students.keySet()) {
        	System.out.println(Students.get(i));
        }*/
        stdNum.close();
	}

}
