package classes;

import interfaces.FurnitureObject;

public class FurnitureFactory {
	
	public FurnitureObject getObject(String objectName) {
		
		switch(objectName) {
			case "cabinet":
				return new Cabinet();
		
			case "chair":
				return new Chair();

			case "table":
				return new Table();

			default:
				return new Unknown();
		}

	}

}
