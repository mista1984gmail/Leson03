package mista1984.Leson3;
import java.util.Scanner;
/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0310 {
    public static void main(String[] args) {
        double a=6;
        double b=9;
        System.out.println("Площадь прямоугольного треугольника со сторонами "+ a+" и "+b+" равна: "+((a*b)/2));
        System.out.println("Периметр прямоугольного треугольника со сторонами "+ a+" и "+b+" равен "+(Math.hypot(a,b)+a+b));

    }
}
