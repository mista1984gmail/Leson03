package mista1984.Lesson4;

/**
 * Created by USER on 18.05.2016.
 */
public class lesson0405 {

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.Name="Чарли";
        dog1.Color="серый";
        dog1.Age=7;

        Dog dog2=new Dog();
        dog2.Name="Бобик";
        dog2.Color="черный";
        dog2.Age=3;

        dog1.dogPrint();

        dog2.dogPrint();

    }
}
