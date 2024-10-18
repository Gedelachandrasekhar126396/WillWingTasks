package JavaTasksAtWork;

public class FindSum {
	 	static int   findSum(int num) {
		int sum = 0;
		while(num>0) {
			int p = num%10;
			sum = sum+(p*p*p);
			num = num/10;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int s1 =  findSum(105);
 // System.out.println(s1);
	}

}
