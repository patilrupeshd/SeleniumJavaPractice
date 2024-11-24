package api.pojo;

import java.time.LocalDate;

public class Review {
    private String customer_id;
    private int rating;
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public LocalDate getReview_date() {
        return review_date;
    }
    public void setReview_date(LocalDate review_date) {
        this.review_date = review_date;
    }
    private String comment;
    private LocalDate review_date;
}
