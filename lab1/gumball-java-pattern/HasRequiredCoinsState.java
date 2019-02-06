public class HasRequiredCoinsState implements State {

	private AbstractGumballMachine gumballMachine;

	public HasRequiredCoinsState(AbstractGumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println( "Insert Coin: You have already inserted required amount. Please turn crank." ) ;
	}

	public void turnCrank() {
		System.out.println( "Turn Crank: Thanks. Enjoy your gumball!" ) ;
		this.gumballMachine.updateInventory(1);
		this.gumballMachine.resetAmount();
		if (this.gumballMachine.getInventory() == 0) {
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
		else {
			this.gumballMachine.setState(this.gumballMachine.getNoCoinState());
		}
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
