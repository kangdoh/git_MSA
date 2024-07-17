// 오버로딩
// 메서드 생성자 이름이 같지만 파라메터가 다를때 사용가능하다..

public class ex003 {
    public static void main(String[] args) {

        person p1 = new person();
        person p2 = new person("850511");
        person p3 = new person("850511", "000001");


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();

    }

}
