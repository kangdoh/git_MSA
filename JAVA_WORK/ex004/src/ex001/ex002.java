package ex001;

public class ex002 {
	public static void main(String[] args) {

		int num1 = 5;

		System.out.println(+num1);
		System.out.println(-num1);

// 브레이크 포인트(더블클릭), 디버그 실행(벌래모양), f6한줄씩 실행, f8 종료

		int num2 = 10;
//	num2가 10이라는 숫자롤 출력 후 ++가 되어서 11이라는 데이터로 증가 후 유지
		System.out.println(num2++);

		// ++는 증가 후 계산 이라는 뜻(12), 11이라는 데이터를 받아서 출력
		System.out.println(++num2);
		// 증가 후 -로 계산 된다. (-12)
		System.out.println(+-num2);
		System.out.println(num2);

		System.out.println(num2--);
		System.out.println(num2);

		
		
		for (int i = 0; i <= 10; i=i+2) {
			System.out.println(i);
			System.out.println(i*i);
			System.out.println("-----");
		}

		
		
	}
}








