public interface State {

	public abstract void insertCoin(Coin coin);

	public abstract void ejectCoin();

	public abstract void turnCrank();

	public abstract void refill(int count);

}
