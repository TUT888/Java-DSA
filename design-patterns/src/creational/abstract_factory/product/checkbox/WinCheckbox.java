package creational.abstract_factory.product.checkbox;

public class WinCheckbox implements Checkbox {
	@Override
	public void display() {
		System.out.println("[ ] Window Checkbox");
	}
}
