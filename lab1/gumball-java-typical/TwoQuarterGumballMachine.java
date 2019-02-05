
/**
 * Write a description of class TwoQuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoQuarterGumballMachine extends AbstractGumballMachine
{
    /**
     * Constructor for objects of class TwoQuarterGumballMachine
     */
    public TwoQuarterGumballMachine(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;

        noCoinState = new NoCoinState(this);
        hasFewerCoinState = new HasFewerCoinState(this);
        hasRequiredCoinsState = new HasRequiredCoinsState(this);
        soldOutState = new SoldOutState(this);

        this.current_amount = 0;
        if (this.num_gumballs > 0) {
            state = noCoinState;
        }
    }

    public void insertCoin(Coin coin)
    {
        if ( coin != Coin.Quarter ) {
            System.out.println( "Insert Coin: Coin of type " + coin.toString() + " is not accepted"  ) ;
        }
        else {
            this.current_amount = this.current_amount + coin.getValue();
        }
        state.insertCoin(coin);
    }

    public int getRequiredAmount() {
        return 50;
    }
}
