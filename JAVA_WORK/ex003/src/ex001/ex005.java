package ex001;

public class ex005 {
	public static void main(String[] args) {
		
		double a = 10.345;
		//	강제 형변환 단축치 ctrl+1
		int b = (int) a;
		
//	쉽게 말해서 큰 단위에서 작은 단위를 바꿀때를 강제형변환
//	큰 단위에서 작은 단위를 바꾸는 것을 자동형변환 이라 한다.
//	double와 같이 소수점까지 표현 할 수 있는 데이터를 자연수만 표현이 가능한 int로
//	바꾸면 소수점 데이터를 잃듯이 데이터 손실이 생긴다고 생각 할 수 있다.
		
		System.out.println(a);
		System.out.println(b);

	
	
		
	}
}