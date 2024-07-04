package ex006;

public class ex005 {

	// 구구단 호출하는 메소드 2 3
	// 여기서 gugu는 main 메소드의 5인것이다.
	public static void aa(int gugu) {
		System.out.println("aa");
		for(int i =0; i<10; i++) {
			System.out.println(gugu*i);
		}
	}
	
	// 최소공배수를 출력하는 메소드, 여기서 num은 main 메소드의 3, 4이다
	public static void bb(int num1, int num2) {
		System.out.println("bb");
		int num = 0;
		while(num < 50) {
			num++;
			if(num%num1==0 && num%num2==0) {
				System.out.println("최소공배수는 = "+num);
				break;
			}
			
		}
	}
	

	public static void main(String[] args) {	
		System.out.println("프로그램시작");
		aa(5);
		bb(3, 4);	
		System.out.println("프로그램끝");
	}
	
	
//	void값을 반환하지 않는다는것을 표현
//	void자리에 int가 들어간다면 int를 반환한다는 뜻이다.
//	double이 들어간다면 double을 반환한다는 뜻이다.
	
}
