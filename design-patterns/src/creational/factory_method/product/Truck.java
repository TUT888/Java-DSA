package creational.factory_method.product;

public class Truck implements Transport {
	@Override
	public void deliver() {
		System.out.println("Deliver by road using a truck...");
	}
}
