package creational.builder.builder;

import creational.builder.component.Garage;
import creational.builder.component.SwimPool;
import creational.builder.house.HouseType;

public interface Builder {
	void setHouseType(HouseType houseType);
	void buildRooms(int rooms);
	void buildWindows(int windows);
	void buildDoors(int doors);
	void buildGarage(Garage garage);
	void buildSwimPool(SwimPool swimPool);
}
