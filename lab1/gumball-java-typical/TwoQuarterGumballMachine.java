
/**
 * Write a description of class TwoQuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoQuarterGumballMachine extends AbstractGumballMachine
{
    // instance variables - replace the example below with your own
    private boolean has_two_quarter;
    /**
     * Constructor for objects of class TwoQuarterGumballMachine
     */
    public TwoQuarterGumballMachine(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_two_quarter = false;
        this.current_amount = 0;
    }

    public void insertCoin(Coin coin)
    {
        if ( coin == Coin.Quarter ) {
            this.current_amount = this.current_amount + Coin.Quarter.getValue();
            if (this.current_amount == 50)
                this.has_two_quarter = true ;
        }
        else {
            this.has_two_quarter = false ;
            System.out.println( "Coin of type " + coin.toString() + " is not accepted"  ) ;
        }
    }

    public void turnCrank()
    {
        if ( this.has_two_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_two_quarter = false ;
    			this.current_amount = 0;
    			System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
    		}
    	}
    	else 
    	{
    	    if (this.current_amount == 0)
    		System.out.println( "Please insert two quarters" ) ;
    	    else if (this.current_amount == 25)
    	        System.out.println( "Please insert one more quarters" ) ;
    	}      
    }
}
