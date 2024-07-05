package ex001;

public class EX004 {
	
	public static void main(String[] args) {
		
		//	강제 형변환 필요
		int num1 = 10;
		short a = num1;
		//	int는 4byte short는 2byte 이기 때문에 불가능
		
		short num2 = (short)num1;
		// 그렇기 때문에 테이터 소실이 되더라고 형을 변형하는 방법
		
		
		
		// 자동 형변환 (위의 반대의 경우)
		short num3 = 20;
		int num4 = num3;
	
		
		
	}
}
