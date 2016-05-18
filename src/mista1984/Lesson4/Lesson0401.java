package mista1984.Lesson4;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by USER on 18.05.2016.
 */
public class Lesson0401 {

    public static void main(String[] args)
    {
        System.out.print("Введите  целое число: ");
        Scanner in = new Scanner(System.in);
        long a;
        a = in.nextLong();
        in.close();
        int b=1;
        for (long i = 10; i < 1000000000; i=i*10)
        {
            if(a>=(i/10) && a<i){
                break;
            }
            else
                b=b+1;
        }
        System.out.println("Ваше число состоит из "+b+" чисел.");

    }
}
