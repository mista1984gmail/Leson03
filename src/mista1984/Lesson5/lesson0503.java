package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class lesson0503 {
    public static void main(String[] args) {

        //String s = "";
        StringBuilder sb=new StringBuilder();
        //long start = System.currentTimeMillis();
        for (int i = Short.MAX_VALUE; i >0; i--) {
            sb.append((char)i);
        }
        //long end = System.currentTimeMillis();
        //System.out.println(end - start);
        //sb.delete(0,200);
        sb.reverse();

        System.out.println(sb);
        //String s1 =sb.toString();


        //if ( s1!= null) {

        //}
    }
}
