public class TwoQuarterGumballMachine extends AbstractGumballMachine {

	public TwoQuarterGumballMachine(int size) {
		this.num_gumballs = size;

		noCoinState = new NoCoinState(this);
		hasFewerCoinState = new HasFewerCoinState(this);
		hasRequiredCoinState = new HasRequiredCoinsState(this);
		soldOutState = new SoldOutState(this);

		this.current_amount = 0;
		if (this.num_gumballs > 0) {
			state = noCoinState;
		}
	}

	public void insertCoin(Coin coin) {
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
