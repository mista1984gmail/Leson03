package mista1984.Lesson6;
import java.util.Scanner;
/**
 * Created by USER on 25.05.2016.
 */
public class Point {

    public double x;
    public double y;
    public Point (){

        System.out.print("Введите коордитату Х:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();

        System.out.print("Введите коордитату Y:");
        Scanner in1 = new Scanner(System.in);
        y = in1.nextDouble();

    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
    public void printQuart(){
        if (x==0 && y==0){
            System.out.println("in 0");
        }
        else if (x==0){
            System.out.println("in line Y");
        }
        else if (y==0){
            System.out.println("in line X");
        }
        else if (x>0 & y>0){
            System.out.println("in 1 quart");
        }

        else if (x<0 & y>0){
            System.out.println("in 2 quart");
        }

        else if (x<0 & y<0){
            System.out.println("in 3 quart");
        }

        else if (x>0 & y<0){
            System.out.println("in 4 quart");
        }

    }

    public static void simPoint(){
        System.out.println("Введите координаты для первой точки:");
        Point pointA=new Point();
        System.out.println(pointA);
        System.out.println("Введите координаты для второй точки:");
        Point pointB=new Point();
        System.out.println(pointB);
        if((pointA.x == Math.abs(pointB.x) || pointB.x == Math.abs(pointA.x)) && (pointA.y == Math.abs(pointB.y) || pointB.y == Math.abs(pointA.y)))
        {
            System.out.println("Точки симметричны.");
        }
        else
            System.out.println("Точки не симметричны.");

    }


    public static void kolinPoint(){
        System.out.println("Введите координаты для первой точки:");
        Point pointA=new Point();
        System.out.println(pointA);
        System.out.println("Введите координаты для второй точки:");
        Point pointB=new Point();
        System.out.println(pointB);
        System.out.println("Введите координаты для третьей точки:");
        Point pointС=new Point();
        System.out.println(pointС);
        double k=(pointB.y-pointA.y)/(pointB.x-pointA.x);
        double b = pointA.y-k*pointA.x;
        if(pointС.y==k*pointС.x+b){
            System.out.println("Точки являются коллинеарными, то есть лежат на одной прямой.");
        }
        else
            System.out.println("Точки не являются коллинеарными, то есть не лежат на одной прямой.");


    }


}
