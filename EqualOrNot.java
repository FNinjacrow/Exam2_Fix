
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

    //Question 24
    public void compare()
    {
        //a
        String valueA = "2";
        String valueB = "3";
        
        //b
        if(valueA.equals(valueB)) {
            System.out.println("EQUAL");
        } 
        else {
            System.out.println("NOT EQUAL");
        }
    }
}
