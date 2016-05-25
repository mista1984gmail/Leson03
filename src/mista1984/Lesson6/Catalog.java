package mista1984.Lesson6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by USER on 25.05.2016.
 */
public class Catalog {

    private int pointer =0;
    final private User[] users;

    public Catalog(int size) {
        users=new User[size];
    }

    public Catalog(User[] users){
        this.users=users;
    }

    public boolean addUser(User user){
        if (pointer<users.length){
            this.users[pointer]=user;
            pointer++;
            return true;
        }
        return false;
    }


    public void print(String form){
        SimpleDateFormat format=new SimpleDateFormat(form);
        for(User user:users){
            System.out.println(getUserInfo(user, format));
        }

    }
    private String getUserInfo(User user,SimpleDateFormat format){
        return user.getFierstName()+ " " + user.getLastName()+ "  " +user.getAdress()+" "+user.getEmail()+" "+format.format(user.getDate());
    }



}
