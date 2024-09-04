package domain;

public class Member {
    protected Long memberId;
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


    public Member(Long memberId, String name, String birth, String phone, String email, String adress, int role, String roginid, String password, String home) {
        this.memberId = memberId;
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

    public Long getMemberId() {
        return memberId;
    }



}
