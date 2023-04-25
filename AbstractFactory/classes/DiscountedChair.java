package classes;

import interfaces.FurnitureObject;

public class DiscountedChair implements FurnitureObject{
	
	String name = "chair";
	Double price = 350.00;
	Double discount = 0.75;
	
	@Override
	public void getDetails() {
		System.out.print("The discounted " + name + " costs " + (price * discount) + " lei. ");
		System.out.println("You save " + (price - (price*discount)) + " lei.");	}

}
