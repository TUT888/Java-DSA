package creational.builder.component;

public class Garage {
	private int carSpace;
	private boolean isOpen;
	
	public Garage(int carSpace) {
		this.carSpace = carSpace;
	}

	public int getCarSpace() {
		return carSpace;
	}
	
	public void setCarSpace(int carSpace) {
		this.carSpace = carSpace;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}
}
