package classes;

import interfaces.FurnitureObject;

public class FurnitureFactory extends AbstractFactory{
	
	public FurnitureObject getObject(String objectName) {
		
		if (objectName.equalsIgnoreCase("chair"))
			return new Chair();
		else if (objectName.equalsIgnoreCase("table"))
			return new Table();
		return null;

	}

}
