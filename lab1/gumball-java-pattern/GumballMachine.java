public interface GumballMachine {

	public abstract void insertCoin(Coin coin);

	public abstract void turnCrank();

	public abstract void ejectCoin();

	public abstract int getRequiredAmount();

	public abstract void refill(int count);

}
