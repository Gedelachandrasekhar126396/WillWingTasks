package JavaTasksAtWork;

public class FindEvenSum {
	static int findEvenSum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%8==0) sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result = findEvenSum(144);
System.out.println(result);
	}

}
