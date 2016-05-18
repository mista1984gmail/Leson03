package mista1984.Lesson4;
import java.util.Scanner;

/**
 * Created by USER on 18.05.2016.
 */
public class Point {
    public int x;
    public int y;
    public Point() {
        System.out.print("Введите коордитату Х:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        System.out.print("Введите коордитату Y:");
        Scanner in1 = new Scanner(System.in);
        y = in1.nextInt();

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
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

    public boolean isBigest(Point p){
        return this.x>p.x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
