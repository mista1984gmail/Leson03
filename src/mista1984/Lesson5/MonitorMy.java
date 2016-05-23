package mista1984.Lesson5;
import java.util.Date;
import java.util.zip.DataFormatException;
/**
 * Created by USER on 23.05.2016.
 */
public class MonitorMy {
    public String nameProducer;
    public int diagonal;
    public String resolution;
    public Date date;
    public boolean speakers;

    @Override
    public String toString()
    {
        return "MonitorMy{" +
                "nameProducer='" + nameProducer + '\'' +
                ", diagonal=" + diagonal +
                ", resolution='" + resolution + '\'' +
                ", date=" + date +
                ", speakers=" + speakers +
                '}';
    }

    public String getNameProducer()
    {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer)
    {
        this.nameProducer = nameProducer;
    }

    public int getDiagonal()
    {
        return diagonal;
    }

    public void setDiagonal(int diagonal)
    {
        this.diagonal = diagonal;
    }

    public String getResolution()
    {
        return resolution;
    }

    public void setResolution(String resolution)
    {
        this.resolution = resolution;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public boolean isSpeakers()
    {
        return speakers;
    }

    public void setSpeakers(boolean speakers)
    {
        this.speakers = speakers;
    }

}
