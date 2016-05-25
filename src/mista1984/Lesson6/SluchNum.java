package mista1984.Lesson6;
import java.util.Random;
/**
 * Created by USER on 25.05.2016.
 */
public class SluchNum {

    static public int SluchNum(int a, int b)
    {
        Random r = new Random();
        int q = r.nextInt(b+1-a) +a;
        return q;

    }

    public static void printMass(int mass1[]){
        for (int i : mass1)
        {
            System.out.print(i + " ");
        }
    }
}


