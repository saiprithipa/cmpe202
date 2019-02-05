
/**
 * Write a description of class AllCoinGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AllCoinGumballMachine extends AbstractGumballMachine
{
    /**
     * Constructor for objects of class AllCoinGumballMachine
     */
    public AllCoinGumballMachine(int size)
    {
        // initialise instance variables
        noCoinState = new NoCoinState(this);
        hasFewerCoinState = new HasFewerCoinState(this);
        hasRequiredCoinsState = new HasRequiredCoinsState(this);
        soldOutState = new SoldOutState(this);
        
        this.num_gumballs = size;
        this.current_amount = 0;
        if (this.num_gumballs > 0) {
            state = noCoinState;
        }
    }

    public void insertCoin(Coin coin)
    {
        this.current_amount = this.current_amount + coin.getValue();
        state.insertCoin(coin);
    }
    
    public void turnCrank()
    {
        state.turnCrank();      
    }
    
    public void ejectCoin() 
    {
        state.ejectCoin();
    }
    
    public int getRequiredAmount() {
        return 50;
    }
}
