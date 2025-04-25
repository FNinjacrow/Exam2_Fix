import java.util.ArrayList;

/**
 * Write a description of class TemperatureMax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureMax
{

    /**
     * Constructor for objects of class TemperatureMax
     */
    public TemperatureMax()
    {
        ArrayList<Double> temperature = new ArrayList<Double>();
        
        temperature.add(37.2);
        temperature.add(32.9);
        temperature.add(37.9);
        temperature.add(37.2);
        temperature.add(47.8);
        temperature.add(7.1);
        
    }

    /**
     * 
     */
    public String checkTemperature(String[] temperature)
    {
        /**
         * Collections.max will grab the highest value without the need to
         * check every single one of them with a loop. After, it returns the
         * maximum value. This will replace the original conditional loop.
         */
        
        Collections.max(temperature);
    }
}
