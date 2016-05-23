package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class User1 {

    private String login;
    private String password;
    private String email;

    private String fierstName;
    private String lastName;
    private Gender gender;

    public User1(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User1(String login, String password, String email, String fierstName, String lastName) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.fierstName = fierstName;
        this.lastName = lastName;
    }

    public User1(String login, String password, String email, String fierstName, String lastName, Gender gender) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.fierstName = fierstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", fierstName='" + fierstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
