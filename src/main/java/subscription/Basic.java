package subscription;

import java.util.Date;

public class Basic extends Subscription{
    static int noOfUsers = 0;
    public Basic(int userId, Date start_date, Date end_date, float price , int maximumNumberOfMovies){
        super(userId ,start_date,  end_date,  price ,  maximumNumberOfMovies);
        noOfUsers++;
    }
}
