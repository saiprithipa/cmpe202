public abstract class AbstractGumballMachine implements GumballMachine {

	protected State state;

	protected State noCoinState;

	protected State hasFewerCoinState;

	protected State hasRequiredCoinState;

	protected State soldOutState;

	protected int num_gumballs;

	protected int current_amount;

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void turnCrank() {
		state.turnCrank();
	}

	protected void setState(State state) {
		this.state = state;
	}

	public void refill(int count) {
		state.refill(count);
	}

	protected State getSoldOutState() {
		return this.soldOutState;
	}

	protected State getNoCoinState() {
		return this.noCoinState;
	}

	protected State getHasRequiredCoinsState() {
		return this.hasRequiredCoinState;
	}

	protected State getHasFewerCoinState() {
		return this.hasFewerCoinState;
	}

	protected int getInventory() {
		return this.num_gumballs;
	}

	protected void addToInventory(int count) {
		this.num_gumballs = this.num_gumballs + count;
	}

	protected void updateInventory(int count) {
		this.num_gumballs = this.num_gumballs - count;
	}

	public String toString() {

		return "Inventory : " + this.num_gumballs + " , current amount: " + this.current_amount;
	}

	protected int getCurrentAmount() {
		return this.current_amount;
	}

	protected void resetAmount() {
		this.current_amount = 0;
	}
}
