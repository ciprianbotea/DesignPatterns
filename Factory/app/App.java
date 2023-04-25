package app;

import classes.FurnitureFactory;
import interfaces.FurnitureObject;

public class App {

	public static void main(String[] args) {

		FurnitureFactory furnitureObject = new FurnitureFactory();
		FurnitureObject cabinet = furnitureObject.getObject("cabinet");
		FurnitureObject chair = furnitureObject.getObject("chair");
		FurnitureObject table = furnitureObject.getObject("table");
		FurnitureObject unknown = furnitureObject.getObject("blabla");
		
		cabinet.getDetails();
		chair.getDetails();
		table.getDetails();
		unknown.getDetails();

	}

}
