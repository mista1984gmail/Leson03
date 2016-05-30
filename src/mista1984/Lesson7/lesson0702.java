package mista1984.Lesson7;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by USER on 30.05.2016.
 */
public class lesson0702 {


    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar(1996,1,12);
        Student student1=new Student (3,2,1002, "Иванов","Иван","Иванович", calendar.getTime());
        Calendar calendar2=new GregorianCalendar(1998,10,22);
        Student student2=new Student (3,2,1003, "Суриков","Павел","Викторович", calendar2.getTime());
        Calendar calendar3=new GregorianCalendar(1999,7,9);
        Student student3=new Student (3,2,1004, "Ларин","Виктор","Павлович", calendar3.getTime());
        Calendar calendar4=new GregorianCalendar(1995,5,5);
        Student student4=new Student (3,2,1005, "Пясецкий","Иван","Петрович", calendar4.getTime());
        Calendar calendar5=new GregorianCalendar(1995,5,5);
        Student student5=new Student (3,2,1005, "Петров","Павел","Петрович", calendar5.getTime());

        Student [] students={student1,student2,student3,student4,student5} ;
       StudentFiltr studentFiltr=new StudentFiltr(students);
        studentFiltr.listByName("Виктор", "dd-MM-yyyy");






    }
}
