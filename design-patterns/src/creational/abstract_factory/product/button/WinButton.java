package creational.abstract_factory.product.button;

public class WinButton implements Button {
	@Override
	public void display() {
		System.out.println("[BTN] Windows BUTTON");
	}
}
