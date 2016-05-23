package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class CPU {

    public String nameProducer;
    public int core;
    public double frequency;

    public String getNameProducer()
    {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer)
    {
        this.nameProducer = nameProducer;
    }

    public int getCore()
    {
        return core;
    }

    public void setCore(int core)
    {
        this.core = core;
    }

    public double getFrequency()
    {
        return frequency;
    }

    public void setFrequency(double frequency)
    {
        this.frequency = frequency;
    }

    @Override
    public String toString()
    {
        return "CPU{" +
                "nameProducer='" + nameProducer + '\'' +
                ", core='" + core + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
