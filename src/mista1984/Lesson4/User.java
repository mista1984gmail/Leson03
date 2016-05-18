package mista1984.Lesson4;
import java.util.Date;
import java.util.zip.DataFormatException;

public class User {

    private  int salary;
    private String firstName; //field
    private String lastName;
    private Date date;

    public void setSalary (int i) {
        if (i>= 0) {
            salary = i;
        } else {
            salary = 0;
        }
    }

    public int getSalary()
    {
        return salary;
    }
    public void print(){
        System.out.println(salary);
    }

}


