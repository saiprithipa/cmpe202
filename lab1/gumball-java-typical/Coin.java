
/**
 * Enumeration class Coins - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Coin
{
    Quarter(25),
    Dime(10),
    Nickel(5);
    
    private int value;
    
    private Coin(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
}
