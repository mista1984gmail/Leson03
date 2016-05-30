package mista1984.Lesson7;
import java.util.Date;
/**
 * Created by USER on 30.05.2016.
 */
public class Film {
    private String nameFilm;
    private String nameFirstActor;
    private String nameSecondActor;
    private Date dateRealise;
    private String country;

    public Film(String nameFilm, String nameFirstActor, String nameSecondActor, Date dateRealise, String country)
    {
        this.nameFilm = nameFilm;
        this.nameFirstActor = nameFirstActor;
        this.nameSecondActor = nameSecondActor;
        this.dateRealise = dateRealise;
        this.country = country;
    }

    public String getNameFilm()
    {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm)
    {
        this.nameFilm = nameFilm;
    }

    public String getNameFirstActor()
    {
        return nameFirstActor;
    }

    public void setNameFirstActor(String nameFirstActor)
    {
        this.nameFirstActor = nameFirstActor;
    }

    public String getNameSecondActor()
    {
        return nameSecondActor;
    }

    public void setNameSecondActor(String nameSecondActor)
    {
        this.nameSecondActor = nameSecondActor;
    }

    public Date getDateRealise()
    {
        return dateRealise;
    }

    public void setDateRealise(Date dateRealise)
    {
        this.dateRealise = dateRealise;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
