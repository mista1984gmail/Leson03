package mista1984.Lesson7;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Created by USER on 30.05.2016.
 */
public class lesson0701 {
    public static void main(String[] args)
    {
        Calendar calendar=new GregorianCalendar(2016,1,12);
        Film filmA=new Film("'Алиса в Зазеркалье'","Джонни Депп","Миа Васиковска",calendar.getTime(),"США");

        Calendar calendar1=new GregorianCalendar(2015,5,20);
        Film filmB=new Film("'Angry Birds в кино'","Джейсон Судейкис","Джош Гад",calendar1.getTime(),"США");

        Calendar calendar2=new GregorianCalendar(2016,05,20);
        Film filmC=new Film("'Иллюзия обмана 2'","Лиззи Каплан","Марк Руффало",calendar2.getTime(),"США");

        CatalogFilms catalog=new CatalogFilms(3);
        catalog.addFilms(filmA);
        catalog.addFilms(filmB);
        catalog.addFilms(filmC);

        catalog.printCatalog("dd-MM-yyyy");

    }
}
