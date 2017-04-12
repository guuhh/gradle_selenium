package Models;

/**
 * Created by grodrigu on 10/4/16.
 */
public class UserLoginDetails {
    public static UserLoginDetails INVALID_EMAIL_DETALS = new UserLoginDetails("invalid.password@gmail.com","invalid password");
    public static UserLoginDetails INVALID_EMAIL_EMPTY = new UserLoginDetails("","invalid password");

    private String userEmail;
    private String userPassword;

    public UserLoginDetails(String userEmail, String userPassword){
        setUserEmail(userEmail);
        setUserPassword(userPassword);
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    public String getUserEmail(){
        return userEmail;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public String getUserPassword(){
        return userPassword;
    }
}
