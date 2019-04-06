/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;
	private App app;

	public CreditCardCVC(App app) {
		this.app = app;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 && !ch.toLowerCase().equals("x")) {
				cvc += ch;
			}
			else if (cnt >= 21 && cnt <= 23 && ch.toLowerCase().equals("x")) {
				cvc = cvc.substring(0, cvc.length() - 1);
				app.updateCount();
			}
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
	}

	@Override
	public String getComponentValue() {
		return cvc;
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}