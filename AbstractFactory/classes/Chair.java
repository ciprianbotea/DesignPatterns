package classes;

import interfaces.FurnitureObject;

public class Chair implements FurnitureObject{
	
	String name = "chair";
	Double price = 350.00;
	
	@Override
	public void getDetails() {
		System.out.println("The " + name + " costs " + price + " lei.");		
	}

}
