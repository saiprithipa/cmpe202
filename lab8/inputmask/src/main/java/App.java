/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum(this);
        exp = new CreditCardExp(this);
        cvc = new CreditCardCVC(this);

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if (ch.equals("") || ch == null) return;
    	if (ch.toLowerCase().equals("x") && count > 0) {
		    screen.key(ch, count);
	    }
	    else {
    		int num;
		    try {
			    num = Integer.parseInt(ch);
		    } catch (NumberFormatException e) {
		    	return;
		    }
		    if (num < 10) {
			    count++;
			    screen.key(ch, count);
		    }
	    }
    }

    public void updateCount() {
    	count--;
    }
}

