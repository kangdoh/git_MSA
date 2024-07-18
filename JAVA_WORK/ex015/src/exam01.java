//1. Student 클래스를 작성하는 연습을 해보도록하자.
//   Student클래스에 getTotal() getAverage() 과 를 추가하시오
//    1. :  getTotal 메서드
//기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
//        (kor), (eng), (math) .
//반환타입 : int
//매개변수 없음 :
//        2. : getAverage 메서드
//기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 없음

class Student{

    private int kor;
    private int eng;
    private int math;
    // setter는 private 변수를 가져오는 역할할을 하고
    // getter는 setter로 가져온 변수의 내용을 바꿀 수 있다.

    // 생성자(이 부분이 틀이라고 생각하면 된다.)
    public Student(int a, int b, int c){
        this.kor = a;
        this.eng = b;
        this.math = c;
    }

    // getTotal()의 괄호 안에는 메인에 있는것을 불러 올때
    public int getTotal(){
        int mount = kor + eng + math;
        return mount;
    // return kor + eng + math; - 이렇게도 표현가능
    }

    public float getAverage(){
        int mount = (kor + eng + math)*100;
        float average100 = (float) (mount/3);
        float average = average100/100;
        return average;
    }
    
    public void show(){
        System.out.println("국어 : "+kor+"\t"+"영어 : "+eng+"\t"+"수학 : "+math);
        System.out.println("총점 : "+getTotal());
        System.out.println("평균 : "+getAverage());
        System.out.println();
    }
}

public class exam01 {
    public static void main(String[] args) {
        // class를 복사해 오는것이다.
        // 이 부분이 틀에 넣을 재료를 정해주는 부분이라고 생각하자
        Student Subject = new Student(100, 10, 20);
        Student Subject02 = new Student(80, 110, 50);

        // subject라는 완성본을 보자
        Subject.show();
        Subject02.show();
    }
}





