package watch_record;

import java.util.Date;

public class WatchRecord {
    private int userId;
    //Content content
    private Date dateOfWatching;
    private int rate;

    public WatchRecord(int userId, Date dateOfWatching) { //add content as a parameter
        this.userId = userId;
        this.dateOfWatching = dateOfWatching;
        this.rate = -1;// rate is not assigned by user
    }

    public WatchRecord(int userId, Date dateOfWatching, int rate) { // add content as a parameter
        this(userId, dateOfWatching);
        this.rate = rate;
    }

    public int getUserId() {
        return userId;
    }

    public Date getDateOfWatching() {
        return dateOfWatching;
    }

    public int getRate() {
        return rate;
    }
}
