package creational.abstract_factory.product.button;

public interface Button {
	default void onClick() {
		System.out.println("You clicked the button.");
	}
	
	void display();
}
