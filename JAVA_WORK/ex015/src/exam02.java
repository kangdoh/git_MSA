//2. 노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
//    - 노래의 제목을 나타내는 title
//    - 가수를 나타내는 artist
//    - 노래가 발표된 연도를 나타내는 year
//    - 국적을 나타내는 country
//또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
//
//    - 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
//    - 노래 정보를 출력하는 show() 메소드
//    - main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
//song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
//        1978년 스웨덴국적의 ABBA가 부른 Dancing Queen

class Song{
//    private(이곳이 필드)는 메모리에 유익히다.
    private String name;
    private String artist;
    private int year;
    private String country;

    // 파라미터가 없는게 기본 생성자가 아니다., 괄호안에있는것이 매개변수이다.
    public Song(String a, String b, int c, String d){
        name = a;
        artist = b;
        year = c;
        country = d;
    }

    // 아래 처럼 매개변수가 없는것이 기본 생성자 이다.
    public Song(){

    }

    public void show(){
        System.out.println(name+artist+year+country);
    }
}
public class exam02 {
    public static void main(String[] args) {
        Song music = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");

        music.show();
    }
}
