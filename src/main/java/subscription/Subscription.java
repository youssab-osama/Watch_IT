package subscription;

import java.util.Date;

public abstract class Subscription {

    private int userId;
    private Date start_date;
    private Date end_date;
    private static double price;
    private final int maximumNumberOfMovies;

    public Subscription(int userId, Date start_date, Date end_date, double price , int maximumNumberOfMovies) {
        this.userId = userId;
        this.start_date = start_date;
        this.end_date = start_date;
        this.end_date.setMonth(end_date.getMonth()+1);
        this.price = price;
        this.maximumNumberOfMovies = maximumNumberOfMovies;
    }

    public int getUserId() {
        return userId;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public double getPrice() {
        return price;
    }

    public int getMaximumNumberOfMovies() {
        return maximumNumberOfMovies;
    }

}
