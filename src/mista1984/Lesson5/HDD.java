package mista1984.Lesson5;

/**
 * Created by USER on 23.05.2016.
 */
public class HDD {

    public int capacity;

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public HDD(int capacity)
    {
        this.capacity = capacity;
    }

    @Override
    public String toString()
    {
        return "HDD{" +
                "capacity=" + capacity +
                '}';
    }
}
