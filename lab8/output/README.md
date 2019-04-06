Patterns Used:
Decorator Pattern:
I chose to use this pattern because the input given by the user had to be manipulated and displayed with spaces for credit card number and a slash for credit card expiration date.

Chain of Responsibility Pattern:
This pattern helps to move between the different components and helps to retain focus in the particular fields like credit card number, credit card expiration date and CVC.

Composite/Component Pattern:
This pattern was selected because the same screen had to display different components.


Added class CreditCardNumDecorator to decorate and display the credit card number which is an input from the user in the format “1234567812345678” but displayed to the user as “1234 5678 1234 5678” in the screen. Space is added by the decorator after every four digits.
Added class CreditCardExpDecorator to decorate and display the credit card expiration date which is an input from the user in the format “0119” but displayed to the user as “01/19” in the screen. A “/” is added by the decorator after the month and before the year.
Added abstract class ComponentDecorator to maintain and keep the common code among the two decorator classes (CreditCardNumDecorator and CreditCardExpDecorator)
