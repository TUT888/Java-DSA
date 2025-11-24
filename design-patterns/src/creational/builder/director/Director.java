package creational.builder.director;

import creational.builder.builder.Builder;
import creational.builder.component.Garage;
import creational.builder.component.SwimPool;
import creational.builder.house.HouseType;

public class Director {
	public void constructTinyHouse(Builder builder) {
		builder.setHouseType(HouseType.TINY_HOUSE);
		builder.buildDoors(1);
		builder.buildRooms(1);
		builder.buildWindows(2);
	}
	
	public void constructStandardHouse(Builder builder) {
		builder.setHouseType(HouseType.STANDARD_HOUSE);
		builder.buildDoors(3);
		builder.buildRooms(3);
		builder.buildWindows(3);
		builder.buildGarage(new Garage(1));
	}
	
	public void constructLuxuryHouse(Builder builder) {
		builder.setHouseType(HouseType.LUXURY_HOUSE);
		builder.buildDoors(5);
		builder.buildRooms(5);
		builder.buildWindows(8);
		builder.buildGarage(new Garage(2));
		builder.buildSwimPool(new SwimPool(20, 16));
	}
}
