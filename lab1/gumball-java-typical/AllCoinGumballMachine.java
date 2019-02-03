
/**
 * Write a description of class AllCoinGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AllCoinGumballMachine extends AbstractGumballMachine
{
    // instance variables - replace the example below with your own
    private boolean has_fifty_cents;
    /**
     * Constructor for objects of class AllCoinGumballMachine
     */
    public AllCoinGumballMachine(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_fifty_cents = false;
        this.current_amount = 0;
    }

    public void insertCoin(Coin coin)
    {
        this.current_amount = this.current_amount + coin.getValue();

        if (this.current_amount >= 50) {
            this.has_fifty_cents = true;
        }
        else {
            this.has_fifty_cents = false;
        }
    }
    
    public void turnCrank()
    {
        if ( this.has_fifty_cents )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_fifty_cents = false ;
    			this.current_amount = 0;
    			if (this.current_amount > 50)
    			     System.out.println( "You inserted more than 50 cents. Gumball Ejected!" ) ;
    			else 
    			     System.out.println( "Thanks for inserting 50 cents. Gumball Ejected!" );
    		} 
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a total of 50 cents." ) ;
    	}      
    }
}
