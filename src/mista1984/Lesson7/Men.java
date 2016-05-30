package mista1984.Lesson7;

/**
 * Created by USER on 30.05.2016.
 */
public class Men {

    private String firstname;
    private Student lastName;
    public int i=20;

    public int getI() {
        return i;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Student getLastName() {
        return lastName;
    }

    public void setLastName(Student lastName) {
        this.lastName = lastName;
    }
    public static void print(){
        System.out.println("Men");
    }
}
