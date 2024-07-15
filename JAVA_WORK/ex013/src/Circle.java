class Circle {
    // private 변수는 setter getter 로 참조 가능하다.
    private int rad;
    private String name;

    //  기본 생성자는 생략가능
    //  다른 생성자 선언시 기본생성자 생략불가


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;
    }

    public Circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getArea(){
        return 3.14*rad*rad;
    }


}
