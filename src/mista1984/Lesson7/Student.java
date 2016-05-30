package mista1984.Lesson7;

import java.util.Date;

/**
 * Created by USER on 30.05.2016.
 */
public class Student {
    private int id;
    private String Familia;
    private String fierstName;
    private String lastName;
    private Date date;
    private int kurs;
    private int gruppa;

    public Student(int gruppa, int kurs, int id, String familia, String fierstName, String lastName, Date date) {
        this.gruppa = gruppa;
        this.kurs = kurs;
        this.id = id;
        Familia = familia;
        this.fierstName = fierstName;
        this.lastName = lastName;
        this.date = date;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String familia) {
        Familia = familia;
    }

    public String getFierstName() {
        return fierstName;
    }

    public void setFierstName(String fierstName) {
        this.fierstName = fierstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGruppa() {
        return gruppa;
    }

    public void setGruppa(int gruppa) {
        this.gruppa = gruppa;
    }
}
