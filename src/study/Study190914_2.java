package study;

public class Study190914_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Man";
		int b = 0;
		
		// 자바는 String을 비교할 때 equal()을 이용합니다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if(a.equals("Man")) {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("남자아니다.");
		}
		
		if(b==3) {
			System.out.println("b는 3이다.");
		}
		else {
			System.out.println("3이 아니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b ==0 ) {
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
	}

}
