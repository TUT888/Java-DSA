package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.button.WinButton;
import creational.abstract_factory.product.checkbox.Checkbox;
import creational.abstract_factory.product.checkbox.WinCheckbox;

public class WinFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}
}
