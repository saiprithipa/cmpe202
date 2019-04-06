/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private CreditCardNumDecorator creditCardNumDecorator;
	private String number = "" ;
	private App app;

	public CreditCardNum(App app) {
		this.app = app;
		creditCardNumDecorator = new CreditCardNumDecorator(this);
	}

	public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if (number.equals(""))
			return "[4444 4444 4444 4444]" + "  ";
		else
			return "[" + creditCardNumDecorator.display() + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		if (cnt <= 16 && !ch.toLowerCase().equals("x")) {
			number += ch;
		} else if (cnt <= 16 && ch.toLowerCase().equals("x")) {
			number = number.substring(0, number.length() - 1);
			app.updateCount();
		} else if (nextHandler != null) {
			nextHandler.key(ch, cnt);
		}
	}

	@Override
	public String getComponentValue() {
		return number;
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}