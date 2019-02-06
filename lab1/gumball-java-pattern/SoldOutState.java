public class SoldOutState implements State {

	private AbstractGumballMachine gumballMachine;

	public SoldOutState(AbstractGumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println( "Insert Coin: No More Gumballs!  Sorry, can't return your quarter." ) ;
	}

	public void turnCrank() {
		System.out.println( "Turn Crank: Sorry, No More Gumballs! Please come later." ) ;
	}

	public void ejectCoin() {
		if (this.gumballMachine.getCurrentAmount() > 0) {
			System.out.println( "Coin ejected!" ) ;
		}
		else {
			System.out.println( "No coins to eject." ) ;
		}
		this.gumballMachine.resetAmount();
	}

	public void refill(int count) {
		this.gumballMachine.addToInventory(count);
		if (this.gumballMachine.getCurrentAmount() >= this.gumballMachine.getRequiredAmount()) {
			this.gumballMachine.setState(this.gumballMachine.getHasRequiredCoinsState());
		}
		else if (this.gumballMachine.getCurrentAmount() > 0) {
			this.gumballMachine.setState(this.gumballMachine.getHasFewerCoinState());
		}
		else {
			this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
		}
	}

}
