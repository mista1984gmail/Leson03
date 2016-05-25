package mista1984.Lesson6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by USER on 25.05.2016.
 */
public class User {

    private String fierstName;
    private String lastName;
    private String email;
    private String adress;
    private Date date;



    public User(String fierstName, Date date, String adress, String email, String lastName) {
        this.fierstName = fierstName;
        this.date = date;
        this.adress = adress;
        this.email = email;
        this.lastName = lastName;
    }

    public String getFierstName() {
        return fierstName;
    }

    public void setFierstName(String fierstName) {
        this.fierstName = fierstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "fierstName='" + fierstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", date=" + date +
                '}';
    }
}
