package profile;

public class Admin extends Profile{

    private static int ID = 0;
    public Admin(String email, String username, String password, String firstName, String lastName)
    {
        super( ++ID ,email,  username,  password,  firstName, lastName);
    }


}
