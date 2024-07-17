public class person {

    private String jumin;
    private String passport;

    public person(){
    }

    public person(String jumin){
        this.jumin = jumin;
    }

    public person(String passport, String jumin) {
        this.passport = passport;
        this.jumin = jumin;
    }

//    @override

    public void show(){
        System.out.println();
        System.out.println();
    }

}
