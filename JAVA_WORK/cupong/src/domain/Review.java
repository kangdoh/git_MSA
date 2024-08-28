package domain;

public class Review extends Member{

    protected int review_id;
    protected int stars;
    protected String contents;
    protected String date;

    public Review(int review_id, int stars, String contents, String date) {
        this.review_id = review_id;
        this.stars = stars;
        this.contents = contents;
        this.date = date;
        super(memder_id);
    }




    public void select() {

    }

}
