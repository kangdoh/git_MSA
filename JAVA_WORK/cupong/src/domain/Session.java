package domain;

//로그인 상태를 유지하기 위한 객체 => 상태 유지 (Stateful)
public class Session {
    private static Session instance; //싱글톤 인스턴스
    private Member currentMember; //현재 로그인된 사용자

    private Session() {} // private 생성자를 통해 외부에서 인스턴스 생성 방지

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    //로그인
    public void setCurrentMember(Member member) {
        this.currentMember = member;
    }

    //로그인된 사용자 가져오기
    public Member getCurrentMember() {
        return currentMember;
    }

    //로그아웃
    public void removeCurrentMember() {
        this.currentMember = null;
    }

    //로그인 되었는지 여부
    public boolean isAuthenticated() {
        return currentMember != null;
    }
}
