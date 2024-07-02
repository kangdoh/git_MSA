package ex001;

// 아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
// 만일 사과의 수가 123개이고
// 하나의 바구니에는 10개의 사과를 담을 수 있다면 13개의 바구니가 필요할 것이다.
// (1)에 알맞은 코드를 넣으시오.
class exam {
	public static void main(String[] args) {
		int num0fApples = 123;
		int size0fBucket = 10;
	
		int a = num0fApples%size0fBucket;
		
		if(a==0) {
			int num0fBuket = (num0fApples/size0fBucket);	
			System.out.println("필요한 바구니의 수 =" + num0fBuket);
		}
		else {
			int num0fBuket = (num0fApples/size0fBucket + 1);
			System.out.println("필요한 바구니의 수 =" + num0fBuket);
		}
	
	}
}




