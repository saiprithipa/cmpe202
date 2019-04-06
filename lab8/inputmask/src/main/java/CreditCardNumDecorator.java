
public class CreditCardNumDecorator extends ComponentDecorator {

	public CreditCardNumDecorator(IDisplayComponent component) {
		super(component);
	}

	@Override
	public String display() {
		String str = decoratedComponent.getComponentValue();

		if (str.length() <= 4) {
			return str;
		}
		else if (str.length() >= 5 && str.length() < 9) {
			return str.substring(0,4) + " " + str.substring(4, str.length());
		}
		else if (str.length() >= 9 && str.length() < 13) {
			return str.substring(0,4) + " " + str.substring(4,8) + " " + str.substring(8, str.length());
		}
		else  {
			return str.substring(0,4) + " " + str.substring(4,8) + " " + str.substring(8,12) + " " + str.substring(12, str.length());
		}
	}
}
