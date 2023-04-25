package classes;

import interfaces.FurnitureObject;

public class DiscountedFurnitureFactory extends AbstractFactory{
	
public FurnitureObject getObject(String objectName) {
	
	if (objectName.equalsIgnoreCase("chair"))
		return new DiscountedChair();
	else if (objectName.equalsIgnoreCase("table"))
		return new DiscountedTable();
	return null;

	}

}
