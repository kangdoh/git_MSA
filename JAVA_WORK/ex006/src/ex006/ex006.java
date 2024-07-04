package ex006;

public class ex006 {
	
//	void값을 반환하지 않는다는것을 표현
//	void자리에 int가 들어간다면 int를 반환한다는 뜻이다.
//	double이 들어간다면 double을 반환한다는 뜻이다.
	
	public static int aa() {
		System.out.println("aa");
		return 10;
	}
	
	public static void main(String[] args) {
		aa();
		int a = aa();
		System.out.println(a);
	}
	
	
	
	
	
}
