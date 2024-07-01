package ex001;

public class ex011 {
	public static void main(String[] args) {

		int num1 = 11;
		int num2 = 22;

		boolean result;

		result = (3 <= num1) && (num1 <= 100);
		System.out.println(result);

		result = num1 % 3 == 0;
		System.out.println(result);

		result = num1 % 2 == 0;
		System.out.println(result);

		result = (num1 % 3 == 0) && (num1 % 3 == 0);
		System.out.println(result);

	// 좌->우 로 계산이 되기 때문에 &&에서 false가 나오더라고 그 뒤에 ||에서 true가 나오면 ture
    // 여기서 중요한 것은 순서에 따라서 false와 true가 바뀔 수 있다는 점이다.
	// ★tip. 괄호를 사용하여 순서를 깔끔히 나눠어 놓자
		result = (num1 % 3 == 0) && (num1 % 3 == 0) || (num2 % 2 == 0);
		System.out.println(result);
		

	
	}
}
