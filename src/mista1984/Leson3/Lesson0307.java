package mista1984.Leson3;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0307 {
    public static void main(String[] args) {

        int[][] mass = new int[8][5];

        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass[i].length; j++) {

                Random random = new Random(90);
                int t = random.nextInt();
                mass[i][j] = t;
            }
        }

        for (int[] mass1 : mass) {
            for (int element : mass1) {
                System.out.print(element + "; ");
            }
            System.out.println();
        }

    }
}
