package ex006;

public class ex004 {

	private static void hieveryone(int a) {
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		int k = 100;
		System.out.println("===프로그램 시작===");
		hieveryone(12+k);
		hieveryone(13*k);	
		System.out.println("===프로그램 종료===");
	}

	
}