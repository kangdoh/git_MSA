//shift + f10 현재 설정된 파일 실행
//ctrl + shift + f10 열려진 파일 실행

// ctrl + alt + l 자동정렬
// shift + delete 한줄삭제

// ctrl + e 파일이동
// shift + shift 파일이동

//alt + shift + . 확대
//alt + shift + , 축소

//alt + 1 프로젝트 경로 이동
//alt + insert 파일 생성

//sout = 출력코드
//main = 메인 메소드

//alt+enter = 빠른 에러처리

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

//        1 + (1+2) + (1+2+3) + (+1+2+3+4) + (1+2+3+4+5)...
//        i=0일때 j가 0에서 0+1까지 반복해라
//        i=1일때 j가 0에서 1+1까지 반복해라
//        i=2일때 j가 0에서 2+1까지 반복해라
//        ...
//        i=10일때 j가 0에서 10+1까지 반복해라

        int sum =0;
        for (int i = 1; i < 11; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j<i+1; j++){
                System.out.println("j = "+j);
                sum = sum+j;
            }
            System.out.println(sum);
        }




    }
}





