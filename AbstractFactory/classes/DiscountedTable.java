package classes;

import interfaces.FurnitureObject;

public class DiscountedTable implements FurnitureObject {

	String name = "table";
	Double price = 700.00;
	Double discount = 0.85;
	
	@Override
	public void getDetails() {
		System.out.print("The discounted " + name + " costs " + (price * discount) + " lei. ");
		System.out.println("You save " + (price - (price*discount)) + " lei.");
	}
}
