package domain;

public class Review{

    // PK
    private int review_id;
    // FK
    private int memder_id;
    private int item_id;
    // NM
    private int stars;
    private String contents;
    private String date;

    public Review(int review_id, int memder_id, int item_id, int stars, String contents, String date) {
        this.review_id = review_id;
        this.memder_id = memder_id;
        this.item_id = item_id;
        this.stars = stars;
        this.contents = contents;
        this.date = date;
    }

    public int getReview_id() {
        return review_id;
    }
    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getMemder_id() {
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