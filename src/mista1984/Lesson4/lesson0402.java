package mista1984.Lesson4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;

/**
 * Created by USER on 18.05.2016.
 */
public class lesson0402 {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = new GregorianCalendar(2010, Calendar.APRIL, 10, 12,24 );
        calendar.set(Calendar.DST_OFFSET, 20*60*60*1000);
        SimpleDateFormat format = new SimpleDateFormat("d MMMM YYYY H mm");
        Date date = calendar.getTime();
        System.out.println(format.format(date));

        //Calendar calendar = new GregorianCalendar(2010, Calendar.APRIL, 10 );
        //SimpleDateFormat format = new SimpleDateFormat("d MMMM YYYY");
        //Date date = calendar.getTime();
        //System.out.println(format.format(date));


        //String data ="2016 01 10";
       // SimpleDateFormat format = new SimpleDateFormat("Y MM d");
        //Date d = format.parse(data);
        //System.out.println(d);


        //SimpleDateFormat format = new SimpleDateFormat("d:MMMM:YY");
        //Date date= new Date();
        //System.out.println(format.format(date));
    }
}
