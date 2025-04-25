import java.util.ArrayList;

/**
 * Write a description of class temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature
{

    /**
     * Constructor for objects of class Temperature
     */
    public Temperature()
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
         * The method refers to the ArrayList to look for all of the 
         * temperature and selects all of them that are "above 37.5" using 
         * a conditionnal method. If there aren't any, then it'll print
         * "the temperature isn't close to be high rnough for a fever". 
         * It's a similar idea for the maximum where it looks through the 
         * ArrayList temperature and will only print the highest value that
         * it can find. Conditionnal loops will use to check the temperature.
         */

        if (temperature.contains(37.5))
        {
          for(String i : temperature)
        {
            System.out.println(i);
        }  
        }
    }
}
