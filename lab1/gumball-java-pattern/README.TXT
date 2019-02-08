GumballMachine.java :: Modified class Gumball Machine to interface Gumball Machine - To provide a contract for all gumball machines that implement this interface.

AbstractGumballMachine.java :: Added an abstract class to have common operations of all gumball machines to be placed in a single class. Made this class abstract as this class need not be instantiated.

State :: An interface that different state classes of the gumball machine implements.

HasRequiredCoinState.java :: A state of the gumball machine where it has the required amount to dispense a gumball.
HasFewerCoinState.java :: A state of the gumball machine where it has lesser number of coins than the required amount.
NoCoinState.java :: A state of the gumball machine where no coin is provided.
SoldOutState.java :: A state of the gumball machine when it is out of gumballs.

Coin.java :: An enum which holds different types of coins.

-----------
Added Files
-----------
Class Diagram.jpeg
State Diagram.jpeg

-------------
Removed Files
-------------
SoldState.java :: Taking care of this state in turnCrank() method within each state.

---------------
Removed Methods
---------------
dispense() method :: Dispense operation is performed when turnCrank() method is called.