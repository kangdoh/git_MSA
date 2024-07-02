package ex001;

//아래의 변수는 num의 값에 따라 "양수", "음수", '0'을 출력하는 코드이다.
//삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
class exam02{
	public static void main(String[] args) {
		int num = 10;
		
//		if(num>0) {
//			System.out.println("양수");
//		}else if(num==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("음수");
//		}
		

//	조건 ? if : else;
//	조건이 여러개면 :
//	"if조건" ? "if출력값" : "else if조건" ? : "else if출력값" : "else출력값"
		
		String result = num>0 ? "양수" : num==0 ? "0" : "음수";
		System.out.println(result);
		
	}
}