package creational.abstract_factory;

import java.util.Scanner;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.MacFactory;
import creational.abstract_factory.factory.WinFactory;

public class Main {
	public static void main(String[] args) {
		CrossPlatformApplication app = initApp();
		
		if (app != null) {
			app.createUI();
			app.renderUI();
		}
	}
	
	private static CrossPlatformApplication initApp() {
		GUIFactory factory = null;
		Scanner sc = new Scanner(System.in);
		
		// Select choice
		OSType[] osOptions = OSType.values();
		System.out.println("Choose a type of Operating System: ");
		for (int i=0; i<osOptions.length; i++) {
			System.out.println(i + ": " + osOptions[i].toString());
		}
		System.out.print("> Your choice: ");
		
		// Process input
		try {
			int c = sc.nextInt();
			switch (osOptions[c]) {
				case OSType.MAC:
					factory = new MacFactory();
					break;
				case OSType.WIN:
					factory = new WinFactory();
					break;
				default:
					System.out.println("Option not found");
			}
		} catch (Exception e) {
			System.out.println("Error when processing input: " + e.getMessage());
		}
		
		// Cleanup and return
		sc.close();
		
		if (factory == null) return null;
		return new CrossPlatformApplication(factory);
	}
}
