package ex001;

//아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다 변환공식이
//[C] = ([F]-32) / 1.8 라고 할때
//(1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.
class exam04{
	public static void main(String[] args) {
		
		int F = 100;
		
		double fc = (F-32)/1.8;
		int cc = (int) (fc*1000); 
		int ABC = cc%10; 
		
		int cc2 = (int) (fc*100);
		double C = (double) cc2/100;
		double B = 0.01;
		
//		if(5<=ABC) {
//			System.out.println("F = " + F);
//			System.out.println("C = " + (C+B));
//			System.out.println("올려");
//		}
//		else {
//			System.out.println("F = " + F);
//			System.out.println("C = " + C);
//			System.out.println("내려");
//		}
//		
		
String result = 5<=ABC ? "F = " + F + "\n" + "C = " + (C+B) + "\n" + "반올림": 
"F = " + F + "\n" + "C = " + C + "\n" + "내림";
		
		System.out.println(result);
		
		
//		+ Math.round(C) 반올림하라는 함수
		
		
	}
}