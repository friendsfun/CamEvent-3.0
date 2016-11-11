package ca.uwaterloo.camevent;

/**
 * Created by serena on 2016-10-15.
 */
public class User {
    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
//    private String username;
//    private String password;
//
//    public Userinfo() {
//
//    }
//
//    public Userinfo(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }

}
