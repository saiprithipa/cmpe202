
/**
 * Write a description of class NoCoinState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoCoinState implements State
{
    // instance variables - replace the example below with your own
    GumballMachine gumballMachine;

    /**
     * Constructor for objects of class NoCoinState
     */
    public NoCoinState(GumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(Coin coin) {
        if (this.gumballMachine.getCurrentAmount() >= this.gumballMachine.getRequiredAmount()) {
            this.gumballMachine.setState(this.gumballMachine.getHasRequiredCoinsState());
        }
        else if (this.gumballMachine.getCurrentAmount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getHasFewerCoinState());
        }
    }

    public void turnCrank() {
        System.out.println( "Turn Crank: Please insert a coin" ) ;
    }
    
    public void ejectCoin() 
    {
        System.out.println( "No Coin to eject." ) ;
        this.gumballMachine.resetAmount();
    }
}
