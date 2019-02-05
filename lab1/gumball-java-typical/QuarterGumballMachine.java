
public class QuarterGumballMachine extends AbstractGumballMachine
{
    public QuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.current_amount = 0;
            
        noCoinState = new NoCoinState(this);
        hasFewerCoinState = new HasFewerCoinState(this);
        hasRequiredCoinsState = new HasRequiredCoinsState(this);
        soldOutState = new SoldOutState(this);
        
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
        return 25;
    }
}
