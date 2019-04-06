/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private CreditCardExpDecorator creditCardExpDecorator;
	private String date = "" ;
	private App app;

	public CreditCardExp(App app) {
		this.app = app;
		creditCardExpDecorator = new CreditCardExpDecorator(this);
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + creditCardExpDecorator.display() + "]" + " ";
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  && !ch.toLowerCase().equals("x")) {
			date += ch;
		}
		else if (cnt >= 17 && cnt <= 20  && ch.toLowerCase().equals("x")) {
			date = date.substring(0, date.length() - 1);
			app.updateCount();
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	@Override
	public String getComponentValue() {
		return date;
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}