
public class CreditCardExpDecorator extends ComponentDecorator{

	public CreditCardExpDecorator(IDisplayComponent component) {
		super(component);
	}

	@Override
	public String display() {
		String str = decoratedComponent.getComponentValue();

		if (str.length() <= 2) {
			return str;
		}
		else {
			return str.substring(0,2) + "/" + str.substring(2, str.length());
		}
	}

}
