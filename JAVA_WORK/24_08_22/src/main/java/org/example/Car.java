package org.example;

// implements Comparable 가 있어야 
// Collections.sort 를 사용 가능하다.
public class Car implements Comparable<Car>{
    private String name;
    private int disp;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", disp=" + disp +
                '}';
    }
    public Car(String name, int disp) {
        this.name = name;
        this.disp = disp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDisp() {
        return disp;
    }
    public void setDisp(int disp) {
        this.disp = disp;
    }
    
    // 여기서 정렬기분 설정
    @Override
    public int compareTo(Car o) {
        return this.disp - o.disp;
    }
}
