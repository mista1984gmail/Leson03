package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class Summ {

    static public int summ(int a,int b){
        return a+b;
    }

    private Summ() {
    }

    static public int summ(int a,int b, int c){
        return a+b+c;
    }

    static public int delet(int a,int b){
        return a/b;
    }

    public static int summ(int...a){
        int summ=0;
        for(int i:a){
            summ+=i;
        }
        return summ;
    }





}
