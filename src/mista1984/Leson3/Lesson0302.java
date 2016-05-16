package mista1984.Leson3;
import java.util.Scanner;
/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0302 {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 7, 8, 10};
        System.out.println("Размер " + mass.length);

        //for (int i : mass) {
           // System.out.print(i);
        //}

        int[]mass1=mass;
        mass1[0]=1000;
        for (int i : mass1) {
            System.out.println(i);
        }
    }
    }

