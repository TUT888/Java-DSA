package creational.builder.house;

import creational.builder.component.Garage;
import creational.builder.component.SwimPool;

public class House {
	private HouseType houseType;
	private int doors;
	private int windows;
	private int rooms;
	private SwimPool swimPool;
	private Garage garage;
	
	public House(HouseType houseType, int doors, int windows, int rooms, SwimPool swimPool, Garage garage) {
		this.houseType = houseType;
		this.doors = doors;
		this.windows = windows;
		this.rooms = rooms;
		this.swimPool = swimPool;
		this.garage = garage;
	}
	
	public HouseType getHouseType() {
		return houseType;
	}
	
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public int getWindows() {
		return windows;
	}
	
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public int getRooms() {
		return rooms;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public SwimPool getSwimPool() {
		return swimPool;
	}
	
	public void setSwimPool(SwimPool swimPool) {
		this.swimPool = swimPool;
	}
	
	public Garage getGarage() {
		return garage;
	}
	
	public void setGarage(Garage garage) {
		this.garage = garage;
	}
}
