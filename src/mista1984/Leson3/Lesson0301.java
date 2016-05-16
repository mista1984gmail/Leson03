package mista1984.Leson3;
import java.util.Scanner;

/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0301 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<mass.length;i++) {
            while (!scanner.hasNextInt());{
                //scanner.next();
            }
            mass[i] = scanner.nextInt();
        }

        for (int i:mass) {
            System.out.print(i);
        }


    }
}
