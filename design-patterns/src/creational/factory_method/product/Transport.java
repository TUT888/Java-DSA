package creational.factory_method.product;

public interface Transport {
	default void load() {
		System.out.println("Loading items for transport...");
	}

	default void unload() {
		System.out.println("Unloading items from transport...");
	}
	
	void deliver();
}
