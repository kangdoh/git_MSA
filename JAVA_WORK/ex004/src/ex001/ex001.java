package ex001;

public class ex001 {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		
		// 하나만 true면 true
		boolean result_or = 10 % 3 == 0 || 10 % 3 == 1;
		// 두개다 true 여야한 true
		boolean result_and = 10 % 3 == 0 && 10 % 3 == 1;
			
		
		System.out.println(result_or);
		System.out.println(result_and);
	}
}
