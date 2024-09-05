package domain;

// 변수명 or 메서드명 : Camel Case ex) userId
// DB 컬럼명 : Snake Case ex) userId
public class Review{

    // PK
    private Long reviewId;
    // FK
    private Long memberId;
    private Long itemId;
    // NM
    private int stars;
    private String contents;
    private String date;

    //Session.getInstance().getCurrentMember().getMemberId() => Member 객체


    public Review(Long reviewId, Long memberId, Long itemId, int stars, String contents, String date) {
        this.reviewId = reviewId;
        this.memberId = memberId;
        this.itemId = itemId;
        this.stars = stars;
        this.contents = contents;
        this.date = date;
    }

    //정적 팩토리 메서드 패턴 vs builder 패턴
    public static Review of(Long memberId, Long itemId, int stars, String contents) {
        return new Review(null, memberId, itemId, stars, contents, null);
    }
    public static Review of(Long reviewId, int stars, String contents) {
        return new Review(reviewId, null, null, stars, contents, null);
    }


    public Long getReviewId() {
        return reviewId;
    }
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getMemderId() {return memberId;}
    public void setmemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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
                "reviewId=" + reviewId +
                ", memberId=" + memberId +
                ", itemId=" + itemId +
                ", stars=" + stars +
                ", contents='" + contents + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}