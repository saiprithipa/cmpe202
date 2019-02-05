
public class Main {
    public static void main(String[] args) {
        //testQuarterGumballMachine();
        testTwoQuarterGumballMachine();
        //testAllCoinGumballMachine();
    }
    
    private static void testQuarterGumballMachine() {
        GumballMachine gumballMachine = new QuarterGumballMachine(2);

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.ejectCoin();
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();

        System.out.println(gumballMachine);
    }
    
    private static void testTwoQuarterGumballMachine() {
        GumballMachine gumballMachine = new TwoQuarterGumballMachine(2);

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
    
    private static void testAllCoinGumballMachine() {
        GumballMachine gumballMachine = new AllCoinGumballMachine(2);

        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Quarter );
        gumballMachine.insertCoin( Coin.Dime );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( Coin.Nickel );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( Coin.Dime );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
