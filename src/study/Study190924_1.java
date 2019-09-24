package study;

public class Study190924_1 {
	
	// 5! = 5 * 4 * 3 * 2 * 1
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i<=number ; i++) {
			sum*=i;
		}
		return sum;
	}
	
	public static int factorial2(int number) {
		if(number == 1) 
			return 1;
		else 
			return number*factorial(number-1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10의 팩토리얼은 : " + factorial(10));
		System.out.println("10의 팩토리얼은 : " + factorial2(10));
	}

}
