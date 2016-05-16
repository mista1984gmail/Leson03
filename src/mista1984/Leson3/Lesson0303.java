package mista1984.Leson3;
import java.util.Scanner;
/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0303 {
    public static void main(String[] args) {
        int [][]matrix=new int[5][5];
        for(int[]mass:matrix){
            for (int element: mass){
                System.out.print(element+"; ");
            }
            System.out.println();
        }
    }
}
