
/**
 * Write a description of interface GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface GumballMachine
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    void insertCoin(Coin coin);

    void turnCrank();
    
    void ejectCoin();

    void setState(State state);

    State getNoCoinState();

    State getHasFewerCoinState();

    State getHasRequiredCoinsState();

    State getSoldState();

    State getSoldOutState();
    
    int getInventory();
    
    void updateInventory(int count);
    
    int getCurrentAmount();
    
    void resetAmount();
    
    int getRequiredAmount();
}
