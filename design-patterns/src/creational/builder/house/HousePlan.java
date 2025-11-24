package creational.builder.house;

import creational.builder.component.Garage;
import creational.builder.component.SwimPool;

public class HousePlan {
	private HouseType houseType;
	private int doors;
	private int windows;
	private int rooms;
	private SwimPool swimPool;
	private Garage garage;
	
	public HousePlan(HouseType houseType, int doors, int windows, int rooms, SwimPool swimPool, Garage garage) {
		this.houseType = houseType;
		this.doors = doors;
		this.windows = windows;
		this.rooms = rooms;
		this.swimPool = swimPool;
		this.garage = garage;
	}
	
	public String display() {
		String info = "------ House Plan ------\n";
		System.out.println("House type: " + houseType);
		System.out.println("Doors: " + doors);
		System.out.println("Windows: " + windows);
		System.out.println("Rooms: " + rooms);
		if (swimPool != null) System.out.println("Swimming Pool: " + swimPool.getLength() + " x " + swimPool.getWidth());
		if (garage != null) System.out.println("Garage: " + garage.getCarSpace() + " car(s)");
		info += "------------------------\n";
		return info;
	}
}
