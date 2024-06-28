package ex002;

public class ex004 {

	public static void main(String[] args) {
	
		// 변수안에 한 문자만 넣으려고 할때는 홀따옴포를 사용한다.
		char a = 'A';
		char b = 'B';
		
		// 변수 안에 여러 문자를 넣으려면 쌍따옴표를 사용한다. 
		// String은 문자영 지정변수
		String aa = "aa";	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(aa);
	
		
		// ★ 형 변환 ★
		// 유니코드 a=65, b=66, c=67 ...
		System.out.println((int)a);
		System.out.println((int)b);
		
		
		System.out.println(a>b);
		
		
		
		
	}
}