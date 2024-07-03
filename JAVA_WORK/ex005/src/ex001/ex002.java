package ex001;

public class ex002 {
	public static void main(String[] args) {
		
		int num = 0;
		
		while((num++)<100) {
//			System.out.println(num);
			
// 7로 나누었을때 0이 안되는 경우 또는 5로 나누었을때 0이 안되는 경우
// (5배수 이외) 또는 (7배수 이외) continue 작동(리턴)
			
			// 5의 배수가 아니거나 7의 배수가 아니어야 한다.(continue)
			// 통과하려면 5의 배수이거나 7의 배수여야 한다.
			if(num%5!=0 || num%7!=0)
//			if(num%7!=0)
//			if(num%5!=0)	
				
// 왜 &&가 아니라 ||인가????
				
				
// 5로 나누었을때 나머지가 0이 아닐때(5배수 이외) continue 작동(리턴)
// 7로 나누었을때 나머지가 0이 아닐때(7배수 이외) continue 작동(리턴)
			
		
			// 작동하면 위로 리턴
			continue;
		
			
			// 7의 배수만 여기로 도달 , 5의 배수만 여기로 도달
			System.out.println(num);
			
		}

		
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★	
// !(A && B)는 A와 B가 모두 true일 때 false가 되고, A나 B 중 하나라도 false일 때 true가 됩니다.
// !(A || B)는 A나 B 중 하나라도 true일 때 false가 되고, A와 B가 모두 false일 때 true가 됩니다.
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★		
		
		
		
	
	}	
}
