
/**
 * Write a description of class HasRequiredCoinsState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HasRequiredCoinsState implements State
{
    // instance variables - replace the example below with your own
    AbstractGumballMachine gumballMachine;

    /**
     * Constructor for objects of class HasRequiredCoinsState
     */
    public HasRequiredCoinsState(AbstractGumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(Coin coin) {
        System.out.println( "Insert Coin: You have already inserted required amount. Please turn crank." ) ;
    }

    public void turnCrank() {
        System.out.println( "Turn Crank: Thanks. Enjoy your gumball!" ) ;
        this.gumballMachine.updateInventory(1);
        this.gumballMachine.resetAmount();
        if (this.gumballMachine.getInventory() == 0) {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
        else {
            this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
        }
    }
    
    public void ejectCoin() 
    {
        System.out.println( "Coin ejected!" ) ;
        this.gumballMachine.resetAmount();
        this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
    }
}
