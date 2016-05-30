package mista1984.Lesson7;

import mista1984.Lesson6.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by USER on 30.05.2016.
 */
public class StudentFiltr {

    private Student []students;

    public StudentFiltr(Student[]students){
        this.students=students;
    }

    public void listByName(String name, String form) {
        SimpleDateFormat format=new SimpleDateFormat(form);
        for (Student student : students) {
            if (student.getFierstName().equals(name)) {
                System.out.println(getStudentsInfo(student, format));
            }
        }
    }
    private String getStudentsInfo(Student student,SimpleDateFormat format){
        return student.getFierstName()+ " "+student.getLastName()+" "+student.getFamilia()+" "+format.format(student.getDate());
    }
    public void listYounger(Date date, String form) {
        SimpleDateFormat format=new SimpleDateFormat(form);
        for (Student student : students) {
            if (student.getDate().equals(date)) {
                System.out.println(getStudentsInfo(student, format));
            }
        }
    }





}
