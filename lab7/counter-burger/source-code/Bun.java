
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options;

    /**
     * Constructor for objects of class Bun
     */
    public Bun(String d)
    {
        // initialise instance variables
       super(d);
    }
 // Side  +1.00 if bun selected is "Gluten Free Bun"
    public void setOptions( String[] options )
    {
       
        this.options = options ;
        for (int i = 0; i<options.length; i++)
        {
        if ("Gluten Free Bun".equals (options[i]) ) this.price += options.length * 1.00 ;
    }
    }

    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
   
}
