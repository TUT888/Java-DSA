package creational.abstract_factory;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.checkbox.Checkbox;

public class CrossPlatformApplication {
	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;
	
	public CrossPlatformApplication(GUIFactory factory) {
		this.factory = factory;
	}
	
	public void createUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}
	
	public void renderUI() {
		button.display();
		checkbox.display();
	}
}
