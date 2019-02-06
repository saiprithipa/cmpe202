public class NoCoinState implements State {

	private AbstractGumballMachine gumballMachine;

	public NoCoinState(AbstractGumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(Coin coin) {
		if (this.gumballMachine.getCurrentAmount() >= this.gumballMachine.getRequiredAmount()) {
			this.gumballMachine.setState(this.gumballMachine.getHasRequiredCoinsState());
		}
		else if (this.gumballMachine.getCurrentAmount() > 0) {
			this.gumballMachine.setState(this.gumballMachine.getHasFewerCoinState());
		}
	}

	public void turnCrank() {
		System.out.println( "Turn Crank: Please insert a coin" ) ;
	}

	public void ejectCoin() {
		System.out.println( "No Coin to eject." ) ;
		this.gumballMachine.resetAmount();
	}

	public void refill(int count) {
		this.gumballMachine.addToInventory(count);
	}

}
