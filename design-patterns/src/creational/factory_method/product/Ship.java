package creational.factory_method.product;

public class Ship implements Transport {
	@Override
	public void deliver() {
		System.out.println("Deliver by sea using a ship...");
	}
}
