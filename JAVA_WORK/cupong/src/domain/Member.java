package domain;

public class Member {
    protected int memder_id;
    protected String name;
    protected String birth;
    protected String phone;
    protected String email;
    protected String adress;
    
    // 역할 나누는 변수
    protected int role;

    protected String roginid;
    protected String password;
    protected String home;


    public Member(int memder_id, String name, String birth, String phone, String email, String adress, int role, String roginid, String password, String home) {
        this.memder_id = memder_id;
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
        this.role = role;
        this.roginid = roginid;
        this.password = password;
        this.home = home;
    }



}
