package creational.factory_method;

import java.util.Scanner;

import creational.factory_method.creator.Logistic;
import creational.factory_method.creator.RoadLogistic;
import creational.factory_method.creator.SeaLogistic;

public class LogisticApp {
	private static Logistic initLogistic() {
		Logistic logistic = null;
		Scanner sc = new Scanner(System.in);
		
		// Select choice
		DeliveryType[] deliveryOptions = DeliveryType.values();
		System.out.println("Choose a type of transportation: ");
		for (int i=0; i<deliveryOptions.length; i++) {
			System.out.println(i + ": " + deliveryOptions[i].toString());
		}
		System.out.print("> Your choice: ");
		
		// Process input
		try {
			int c = sc.nextInt();
			switch (deliveryOptions[c]) {
				case DeliveryType.ROAD:
					logistic = new RoadLogistic();
					break;
				case DeliveryType.SEA:
					logistic = new SeaLogistic();
					break;
				default:
					System.out.println("Option not found");
			}
		} catch (Exception e) {
			System.out.println("Error when processing input: " + e.getMessage());
		}
		
		// Cleanup and return
		sc.close();
		return logistic;
	}
	
	public static void main(String[] args) {
		Logistic logistic = initLogistic();
		
		if (logistic != null) {
			logistic.planDelivery();
		}
	}
}
