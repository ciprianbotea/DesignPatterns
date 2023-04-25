package app;

import classes.AbstractFactory;
import classes.FactoryProducer;
import interfaces.FurnitureObject;

public class App {

	public static void main(String[] args) {
		
		AbstractFactory regularProduct = new FactoryProducer().getFactory(false);
		FurnitureObject chair = regularProduct.getObject("chair");
		FurnitureObject table = regularProduct.getObject("table");
				
		AbstractFactory discountedProduct = new FactoryProducer().getFactory(true);
		FurnitureObject discountedChair = discountedProduct.getObject("chair");
		FurnitureObject discountedTable = discountedProduct.getObject("table");
		
		chair.getDetails();
		table.getDetails();
		discountedChair.getDetails();
		discountedTable.getDetails();

	}

}
