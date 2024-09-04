package domain;

// 변수명 or 메서드명 : Camel Case ex) userId
// DB 컬럼명 : Snake Case ex) user_id
public class Review{

    // PK
    private int review_id;
    // FK
    private Long member_id;
    private Long item_id;
    // NM
    private int stars;
    private String contents;
    private String date;

    //Session.getInstance().getCurrentMember().getMemberId() => Member 객체

    public Review(Long member_id, Long item_id, int stars, String contents) {
        this.member_id = member_id;
        this.item_id = item_id;
        this.stars = stars;
        this.contents = contents;
    }

//    public Review(Long item_id, int stars, String contents) {
//        this.item_id = item_id;
//        this.stars = stars;
//        this.contents = contents;
//    }

    public int getReview_id() {
        return review_id;
    }
    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public Long getMemder_id() {
        return memder_id;
    }
    public void setMemder_id(int memder_id) {
        this.memder_id = memder_id;
    }

    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "review_id=" + review_id +
                ", memder_id=" + memder_id +
                ", item_id=" + item_id +
                ", stars=" + stars +
                ", contents='" + contents + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}