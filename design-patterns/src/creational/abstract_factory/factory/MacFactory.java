package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.button.MacButton;
import creational.abstract_factory.product.checkbox.Checkbox;
import creational.abstract_factory.product.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
