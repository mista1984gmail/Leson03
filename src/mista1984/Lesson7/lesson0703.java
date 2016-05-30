package mista1984.Lesson7;

/**
 * Created by USER on 30.05.2016.
 */
public class lesson0703 {
    public static void main(String[] args) {
        Men men=new Admin();
        Admin admin=new Admin();
        /*System.out.println(men.i);
        System.out.println(men.getI());
        System.out.println("*********");
        System.out.println(admin.i);
        System.out.println(admin.getI());*/
        Admin.print();
        Men.print();




        //men.setFirstname("Saha");
        //System.out.println(men.getFirstname());

        //men.getLastName();
        //Admin admin=new Admin();

        /*if (men instanceof Admin) {
            Admin admin=(Admin) men;
            admin.getPass();

            //System.out.println("Admin_detected");
        }
        else {
            System.out.println("all right");
        }*/



    }
}
