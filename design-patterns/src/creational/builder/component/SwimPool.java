package creational.builder.component;

public class SwimPool {
	private int length;
	private int width;
	private boolean isFilled;
	
	public SwimPool(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public boolean isFilled() {
		return isFilled;
	}
	
	public void fill() {
		this.isFilled = true;
	}
	
	public void emtpy() {
		this.isFilled = false;
	}
}
