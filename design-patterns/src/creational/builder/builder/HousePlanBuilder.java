package creational.builder.builder;

import creational.builder.component.Garage;
import creational.builder.component.SwimPool;
import creational.builder.house.HousePlan;
import creational.builder.house.HouseType;

public class HousePlanBuilder implements Builder {
	private HouseType houseType;
	private int doors;
	private int windows;
	private int rooms;
	private SwimPool swimPool;
	private Garage garage;
	
	@Override
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}
	
	@Override
	public void buildRooms(int rooms) {
		this.rooms = rooms;
	}
	
	@Override
	public void buildWindows(int windows) {
		this.windows = windows;
	}
	
	@Override
	public void buildDoors(int doors) {
		this.doors = doors;
	}
	
	@Override
	public void buildGarage(Garage garage) {
		this.garage = garage;
	}
	
	@Override
	public void buildSwimPool(SwimPool swimPool) {
		this.swimPool = swimPool;
	}
	
	public HousePlan getResult() {
		return new HousePlan(houseType, doors, windows, rooms, swimPool, garage);
	}
}
