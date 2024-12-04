package profile;

public abstract class Profile {
    private int ID;
    private String email;
    private String username;
    private String password;

    private String firstName;
    private String lastName;
    public Profile(int ID, String email, String username, String password, String firstName, String lastName) {
        this.ID = ID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Profile(String email, String password) {
        this.email = email;
        this.password = password;   
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
