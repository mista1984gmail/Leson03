package mista1984.Lesson7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
/**
 * Created by USER on 30.05.2016.
 */
public class CatalogFilms {

private int pointer =0;

    final private Film[] filmss; //массив фильмов

    public CatalogFilms(int size) { //конструктор1
        filmss=new Film[size];
    }


    public boolean addFilms(Film films)
    {
        if (pointer<filmss.length){
            this.filmss[pointer]=films;
            pointer++;
            return true;
        }
        return false;
    }
    public void printCatalog(String form){
        SimpleDateFormat format=new SimpleDateFormat(form);
        for(Film film:filmss){
            System.out.println(getFilmInfo(film, format));
        }

    }

    private String getFilmInfo(Film film,SimpleDateFormat format){
        return film.getNameFilm()+ " "+film.getCountry()+" "+film.getNameFirstActor()+" "+film.getNameSecondActor()+" "+format.format(film.getDateRealise());
    }
}
