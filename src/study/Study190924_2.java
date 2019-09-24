package study;

public class Study190924_2 {
	
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1) {
			return one;
		}
		else if(number ==2) {
			return two;
		}
		else {
			for(int i=2; i<number;i++) {
				result=one+two;
				one=two;
				two=result;
			}
		}
		return result;
	}
	
	public static int fibonacci2(int number) {
		if(number == 1) {
			return 1;
		}
		else if(number==2) {
			return 1;
		}
		else {
			return fibonacci2(number-2)+fibonacci2(number-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("피보나치수열의 10번째 원소는 : " +fibonacci(10));
		System.out.println(fibonacci2(10));
	}

}
