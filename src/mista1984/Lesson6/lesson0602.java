package mista1984.Lesson6;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by USER on 25.05.2016.
 */
public class lesson0602 {
    public static void main(String[] args) {

        Calendar calendar=new GregorianCalendar(2000,1,12);
        User userA=new User("Ivan",calendar.getTime(),"Grodno","mkmkm","Ivanov");
        Calendar calendar1=new GregorianCalendar(1984,5,9);
        User userB=new User("Petia",calendar1.getTime(),"Minsk","mkmm","Petrov");
        Calendar calendar2=new GregorianCalendar(1988,2,25);
        User userC=new User("Sacha",calendar2.getTime(),"Vitebsk","mkmm","Pashkevich");
        Catalog catalog=new Catalog(3);
        catalog.addUser(userA);
        catalog.addUser(userB);
        catalog.addUser(userC);

        catalog.print("EEE, MMM d, ''yyyy");








    }
}
