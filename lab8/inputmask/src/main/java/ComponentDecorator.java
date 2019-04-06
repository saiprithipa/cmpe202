
public abstract class ComponentDecorator implements Decorate {

	protected IDisplayComponent decoratedComponent;

	public ComponentDecorator(IDisplayComponent component) {
		this.decoratedComponent = component;
	}
}
