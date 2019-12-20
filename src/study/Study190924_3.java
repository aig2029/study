package study;

public class Study190924_3 {
	
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("생성할 배열의 크기를 입력하세요 : ");
//		int number = scanner.nextInt();
//		
//		int[] array = new int[number];
//		for (int i = 0; i < number; i++) {
//			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 :");
//			array[i] = scanner.nextInt();
//		}
//		int result = -1;
//		for (int i = 0; i < number; i++) {
//			result = max(result,array[i]);
//		}
//		System.out.println(result+" 가장큰값입니다!");
//		
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random()*100+1);
			//Math.random() --> 0~0.xxx 임의의 수 0<=x<1
		}
		
		int sum=0;
		for (int i = 0; i < 100; i++) {
			sum+=array[i];
		}
		System.out.println(sum/100);
	}

}
