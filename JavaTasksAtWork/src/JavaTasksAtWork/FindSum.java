package JavaTasksAtWork;

public class FindSum {
	 	static int   findSum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum+(i*i*i);
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int s1 =  findSum(10);
  System.out.println(s1);
	}

}
