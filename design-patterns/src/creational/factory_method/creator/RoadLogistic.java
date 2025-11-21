package creational.factory_method.creator;

import creational.factory_method.product.Transport;
import creational.factory_method.product.Truck;

public class RoadLogistic extends Logistic {
	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
