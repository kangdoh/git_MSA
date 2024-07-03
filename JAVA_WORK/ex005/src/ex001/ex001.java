package ex001;

public class ex001 {
//	3과 4의 최소공배수 찾기
	public static void main(String[] args) {
		
		
		for(int num = 1; num<100; num++) {
//			System.out.println(num);
		
			if(num%3 == 0 && num%4==0) {
				System.out.println("최소공배수 = "+ num);

//				break;
				
				if(num == 24)
				continue;
				
				if (num%12 == 0) { 
					System.out.println(num*5);					
				}
		
				
			}
			
		}
		
		
		
		
		
		
	}
}
