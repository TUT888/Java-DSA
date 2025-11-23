package creational.abstract_factory.product.checkbox;

public interface Checkbox {
	default void onCheckChange() {
		System.out.println("You toggled the checkbox.");
	}
	
	void display();
}
