package ex001;

public class ex006 {
	public static void main(String[] args) {

//		삼항 연산자
		
		int a = 10;
		int b = 20;
		String result = a > b ? "a는 b보다 큽니다." : "a는 b보다 작습니다.";
		System.out.println(result);

		// 위 아래 같은 식이다
		
		int c = 10;
		int d = 20;
		if(c>d) {
			System.out.println("a는 b보다 큽니다.");
		}else {
			System.out.println("a는 b보다 작습니다.");
		}
		
		
//		조건 ? if : else;  -> 이런 느낌 		
	}
}