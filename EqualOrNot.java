
/**
 * Write a description of class Comparison here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EqualOrNot
{

    /**
     * Constructor for objects of class EqualOrNot
     */
    public EqualOrNot()
    {
        
    }

    /**
     * 
     */
    public String compare()
    {
        String valueA = "2";
        String valueB = "2";
        
        if(valueA == valueB)
        {
            System.out.println("Both values are equal.");
        } 
        else
        {
            System.out.println("Both values aren't equal.");
        }
        return valueA;
    }
}
