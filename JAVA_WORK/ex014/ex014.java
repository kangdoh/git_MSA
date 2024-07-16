class Person{
    String name;

    public void greeting(){
        System.out.println(name +" hellow");
    }
}

//constructor로 private 변수를 바꿀수 있다.
//setter로 pivate 변수를 바꿀 수 있다.
public class ex014 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.greeting();
        p2.greeting();
    }

}