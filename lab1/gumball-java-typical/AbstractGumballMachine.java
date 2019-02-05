
/**
 * Abstract class AbstractGumballMachine - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class AbstractGumballMachine implements GumballMachine
{
    protected State state;
    public State noCoinState;
    State hasFewerCoinState;
    State hasRequiredCoinsState;
    State soldState;
    State soldOutState;
    
    // instance variables - replace the example below with your own
    protected int num_gumballs;
    protected int current_amount;
    
    public String toString() {
        return "Inventory : " + this.num_gumballs + " , current amount: " + this.current_amount;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public State getNoCoinState() { 
        return this.noCoinState;
    }
    
    public State getHasFewerCoinState() { 
        return this.hasFewerCoinState;
    }
    
    public State getHasRequiredCoinsState() { 
        return this.hasRequiredCoinsState;
    }
    
    public State getSoldState() { 
        return this.soldState;
    }
    
    public State getSoldOutState() { 
        return this.soldOutState;
    }
    
    public int getInventory() {
        return this.num_gumballs;
    }
    
    public void updateInventory(int count) {
        this.num_gumballs = this.num_gumballs - count;
    }
    
    public int getCurrentAmount() {
        return this.current_amount;
    }
    
    public void resetAmount() {
        this.current_amount = 0;
    }
}
