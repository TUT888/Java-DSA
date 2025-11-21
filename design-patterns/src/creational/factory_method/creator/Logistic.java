package creational.factory_method.creator;

import creational.factory_method.product.Transport;

public abstract class Logistic {
	public void planDelivery() {
		Transport transport = createTransport();
		
		transport.load();
		transport.deliver();
		transport.unload();
		
		System.out.println("DONE!");
	}
	
	protected abstract Transport createTransport();
}
