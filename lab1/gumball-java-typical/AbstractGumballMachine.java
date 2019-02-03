
/**
 * Abstract class AbstractGumballMachine - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class AbstractGumballMachine implements GumballMachine
{
    // instance variables - replace the example below with your own
    protected int num_gumballs;
    protected int current_amount;
    
    
    public String toString() {
        return "Inventory : " + this.num_gumballs + " , current amount: " + this.current_amount;
    }
}
