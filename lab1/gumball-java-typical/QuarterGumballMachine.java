
public class QuarterGumballMachine extends AbstractGumballMachine
{

    private boolean has_quarter;

    public QuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(Coin coin)
    {
        if ( coin == Coin.Quarter ) {
            this.has_quarter = true ;
        }
        else {
            this.has_quarter = false ;
            System.out.println( "Coin of type " + coin.toString() + " is not accepted"  ) ;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
