package creational.factory_method.creator;

import creational.factory_method.product.Ship;
import creational.factory_method.product.Transport;

public class SeaLogistic extends Logistic {
	@Override
	public Transport createTransport() {
		return new Ship();
	}
}
