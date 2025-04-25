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
        ArrayList<Double> temperatures = new ArrayList<Double>();
        
        temperatures.add(37.2);
        temperatures.add(32.9);
        temperatures.add(37.9);
        temperatures.add(37.2);
        temperatures.add(47.8);
        temperatures.add(7.1);
        
        fever(temperatures);
    }

    //Question 25
    public void fever (ArrayList<Double> temperatures)
    {
        int count = 0;
        double max = 0.0;
        
        for (Double temp : temperatures)
        {
            if (temp>37.5) 
            {
                count++;
            }
            if (temp>max)
            {
                max = temp;
            }
        }
        
        System.out.println("Amount of fever: " + count);
        System.out.println("Highest fever: " + max);
    }
}
