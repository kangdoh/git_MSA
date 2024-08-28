package org.example;

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o){
        Person p = (Person) o; //이게 무슨말인가?
//        if(this.age>p.age){
//            return 1;
//        } else if (this.age<p.age) {
//            return -1;
//        }else {
//            return 0;
//        }
        return this.age - p.age; //이게 무슨말인가?
    }
}


public class MainEx {
    public static void main(String[] args) {
//        Car car1 = new Car(10);
//        Car car2 = new Car(10);
//
//        car1.setEngine(10);
//        car2.setEngine(10);

        // primitive type (기본타입) int, double, boolean, float
        // reference type (참조타입, 객체타입) int[], String, Person, Integer, Boolean,

        /*
        unboxing <-> boxing
        int <-> Integer
        double <-> Double
        boolean <-> Boolean
         */

        String s = "10";

        int i = Integer.parseInt(s);

//        Integer val = 1000;
//        int res = 0;
//
//        for (int i = 0; i < val; i++) {
//            res += i;
//        }


//        System.out.println(car1);
//        System.out.println(car2);
//        // Object의 equals 메소드
//        System.out.println(car1.equals(car2));

    }

}
