package mista1984.Lesson5;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by USER on 23.05.2016.
 */
public class PersonalComputer {
    public static void main(String[] args)
    {
        MonitorMy myPCMonitor = new MonitorMy();
        myPCMonitor.nameProducer = "HP";
        myPCMonitor.diagonal = 15;
        myPCMonitor.resolution="1200*800";
        myPCMonitor.speakers=true;
        System.out.println(myPCMonitor.toString());

        HDD myPC_HDD=new HDD(500);
        System.out.println(myPC_HDD.toString());

        CPU myPC_CPU = new CPU();
        myPC_CPU.nameProducer="Intel";
        myPC_CPU.core=3;
        myPC_CPU.frequency=2.3;

        System.out.println(myPC_CPU.toString());




    }



}
