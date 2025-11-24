package creational.builder;

import java.util.Scanner;

import creational.builder.builder.HouseBuilder;
import creational.builder.builder.HousePlanBuilder;
import creational.builder.director.Director;
import creational.builder.house.House;
import creational.builder.house.HousePlan;
import creational.builder.house.HouseType;

public class Demo {
	public static void main(String[] args) {
		Director director = new Director();
		HouseBuilder houseBuilder = new HouseBuilder();
		HousePlanBuilder housePlanBuilder = new HousePlanBuilder();
		
		HouseType selectedType = readUserInput();
		if (selectedType == null) {
			System.out.println("Invalid type, exiting application.");
			return;
		}
		
		House newHouse = null;
		HousePlan newHousePlan = null;
		switch (selectedType) {
			case HouseType.TINY_HOUSE:
				director.constructTinyHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructTinyHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			case HouseType.STANDARD_HOUSE:
				director.constructStandardHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructStandardHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			case HouseType.LUXURY_HOUSE:
				director.constructLuxuryHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructLuxuryHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			default:
				System.out.println("Option not found");
		}
		
		System.out.println("House: " + newHouse.getHouseType());
		System.out.println("--- House Plan ---");
		newHousePlan.display();
	}
	
	private static HouseType readUserInput() {
		Scanner sc = new Scanner(System.in);
		
		// Select choice
		HouseType[] options = HouseType.values();
		System.out.println("Choose a type: ");
		for (int i=0; i<options.length; i++) {
			System.out.println(i + ": " + options[i].toString());
		}
		System.out.print("> Your choice: ");
		
		// Cleanup and return
		HouseType selectedType = null;
		try {
			int c = sc.nextInt();
			selectedType = options[c];
		} catch (Exception e) {
			System.out.println("Error when processing input: " + e.getMessage());
		}
		
		sc.close();
		return selectedType;
	}
}
