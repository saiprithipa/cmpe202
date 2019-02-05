
/**
 * Write a description of class HasFewerCoinState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HasFewerCoinState implements State
{
     // instance variables - replace the example below with your own
    AbstractGumballMachine gumballMachine;

    /**
     * Constructor for objects of class HasRequiredCoinsState
     */
    public HasFewerCoinState(AbstractGumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(Coin coin) {
        if (this.gumballMachine.getCurrentAmount() >= this.gumballMachine.getRequiredAmount()) {
            this.gumballMachine.setState(this.gumballMachine.getHasRequiredCoinsState());
        }
    }
    
    public void turnCrank() {
        System.out.println( "Turn Crank: Please insert required amount" ) ;
    }
    
    public void ejectCoin() 
    {
        System.out.println( "Coin ejected!" ) ;
        this.gumballMachine.resetAmount();
        this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
    }
}
