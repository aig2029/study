package study;

public class Study190913_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 60;
		
		System.out.println("최대값은 : " + max(x,y));
	}
	
	// 클래스 내에서 공유하는 자원으롤 쓰려면 static을 붙여라.
	static int max (int a, int b) {
		int result = (a>b)? a:b;
		return result;
	}

}
