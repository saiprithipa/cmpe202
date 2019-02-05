
/**
 * Write a description of class SoldOutState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoldOutState implements State
{
    // instance variables - replace the example below with your own
    AbstractGumballMachine gumballMachine;

    /**
     * Constructor for objects of class SoldOutState
     */
    public SoldOutState(AbstractGumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(Coin coin) {
        System.out.println( "Insert Coin: No More Gumballs!  Sorry, can't return your quarter." ) ;
    }

    public void turnCrank() {
        System.out.println( "Turn Crank: Sorry, No More Gumballs! Please come later." ) ;
    }

    public void ejectCoin() 
    {
        if (this.gumballMachine.getCurrentAmount() > 0) {
            System.out.println( "Coin ejected!" ) ;
        }
        else {
            System.out.println( "No coins to eject." ) ;
        }
        this.gumballMachine.resetAmount();
    }
}
