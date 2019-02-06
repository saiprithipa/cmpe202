public class HasFewerCoinState implements State {

	private AbstractGumballMachine gumballMachine;

	public HasFewerCoinState(AbstractGumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(Coin coin) {
		if (this.gumballMachine.getCurrentAmount() >= this.gumballMachine.getRequiredAmount()) {
			this.gumballMachine.setState(this.gumballMachine.getHasRequiredCoinsState());
		}
	}

	public void turnCrank() {
		System.out.println( "Turn Crank: Please insert required amount" ) ;
	}

	public void ejectCoin() {
		System.out.println( "Coin ejected!" ) ;
		this.gumballMachine.resetAmount();
		this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
	}

	public void refill(int count) {
		this.gumballMachine.addToInventory(count);
	}

}
