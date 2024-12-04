package profile;
import watch_record.WatchRecord;

import java.lang.reflect.Array;

public class Customer extends Profile{

    // Array<WatchRecord> ;
    //content[] watchLater;

    //Subsciption subscription;
    private static int ID = 0;
    public Customer(String email, String username, String password, String firstName, String lastName)
    {
        super( ++ID ,email,  username,  password,  firstName, lastName);
    }

    public Customer(String email, String password)
    {
        super(email,password);
    }

    public void watch_A_Content(/*Content content*/)
    {

    }


}
