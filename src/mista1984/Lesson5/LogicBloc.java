package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class LogicBloc {


    {
        System.out.println("in constructor");
    }



    public LogicBloc(int i){
        System.out.println(this.i);
        //System.out.println(i);
        this.i=i;
    }

    private int i=getI();

    private int getI(){
        System.out.println("init field");
        return 20;
    }
}
