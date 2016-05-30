package mista1984.Lesson7;

/**
 * Created by USER on 30.05.2016.
 */
public class Admin extends Men{
    private String pass;
    public int i=100;

    public int getI() {
        return i;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname+" Admin");
    }
    public static void print(){
        System.out.println("Admin");
    }
}
