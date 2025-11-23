package creational.abstract_factory.factory;

import creational.abstract_factory.product.button.Button;
import creational.abstract_factory.product.checkbox.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
