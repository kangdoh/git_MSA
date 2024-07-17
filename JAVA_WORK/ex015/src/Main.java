// 파일 업로드시 exe파일을 올릴수 없도록 검사 할때 사용한다.
public class Main {
    public static void main(String[] args) {

    //  정규편시
    //  .(점) 을 기준으로 나누는 코드
        String str = "Hellow.java";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        if (temp[0].equals("exe"))
            return;

        str = "Hellow.java";
        temp = str.split("[A-Z]");

        System.out.println(temp[0]);
        System.out.println(temp[1]);
    }
}