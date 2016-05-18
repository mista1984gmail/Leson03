package mista1984.Lesson4;

/**
 * Created by USER on 18.05.2016.
 */
public class Dog {

    public String Name;
    public String Color;
    public int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void dogPrint(){
        System.out.println("Имя: "+ Name);
        System.out.println("Цвет: "+ Color);
        System.out.println("Возраст: "+ Age);
    }
}
