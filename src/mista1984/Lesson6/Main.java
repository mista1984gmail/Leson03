package mista1984.Lesson6;
import java.util.Arrays;
import java.util.Random;
/**
 * Created by USER on 25.05.2016.
 */
public class Main {

    private static final int COUNT =10;

    public static void main(String[] args) {

        //int []mass=generateMass(10,20);
        //System.out.println(Arrays.toString(mass));

    }
        private int[] generateMass(int count, int s){
        int []mass=new int[count];

        Random r = new Random();
        for (int i=0; i<mass.length;i++){
            mass[i]=r.nextInt(s);
        }
        return  mass;
    }

    /*private static int[] generateMass(int count){

        return  generateMass(count,Integer.MAX_VALUE);
    }

    private static int[] generateMass(){

        return  generateMass(COUNT);
    }*/


    private void sort (int[]mass){
        for (int j = 0; j <mass.length ; j++) {

        for(int i=0;i<mass.length-1;i++) {
            int a = mass[i];
            int b = mass[i + 1];
            if (a > b) {
                mass[i] = b;
                mass[i + 1] = a;
            }
        }

        }
    }




}
