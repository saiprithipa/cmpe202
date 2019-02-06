public class AllCoinGumballMachine extends AbstractGumballMachine {

	public AllCoinGumballMachine(int size) {
		noCoinState = new NoCoinState(this);
		hasFewerCoinState = new HasFewerCoinState(this);
		hasRequiredCoinState = new HasRequiredCoinsState(this);
		soldOutState = new SoldOutState(this);

		this.num_gumballs = size;
		this.current_amount = 0;
		if (this.num_gumballs > 0) {
			state = noCoinState;
		}
	}

	public void insertCoin(Coin coin) {
		this.current_amount = this.current_amount + coin.getValue();
		state.insertCoin(coin);
	}

	public int getRequiredAmount() {
		return 50;
	}

}
