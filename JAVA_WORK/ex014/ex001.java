class InstClass{
    static int num = 0;
    InstClass(){
        num++;
        System.out.println(num);
    }
}

public class ex001 {
    // public static  void sub(){}

    public static void main(String[] args) {
        System.out.println(InstClass.num);
        new InstClass();
        new InstClass();
        new InstClass();
        new InstClass();
        new InstClass();
    }
}