package ex002;

public class ex007 {

	public static void main(String[] args) {
		// final은 상수의 변경이 불가능 하다. ex)MAX_SIZE = 200; 
		final int MAX_SIZE = 100;
		System.out.println(MAX_SIZE);
			
		final double AA = 200;
		System.out.println(AA);
		
		final String c = "변경불가";
		System.out.println(c);
		
		
				
		float result = (float) (3.3 + 4.5);
		System.out.println(result);
		
		System.out.printf("정수는 %d 실수는 %f", 10,20.33);
	
		// 뒤에 L을 붙이면 int가 long으로 변경(int의 범위를 넘을때 오류)
		System.out.println(5151513878743548L);
	
		// E9는 10의9승 이라는 뜻이다.
		System.out.println(3.4*1000000000);	
	}
}