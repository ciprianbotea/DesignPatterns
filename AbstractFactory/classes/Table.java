package classes;

import interfaces.FurnitureObject;

public class Table implements FurnitureObject{
	
	String name = "table";
	Double price = 700.00;
	
	@Override
	public void getDetails() {
		System.out.println("The " + name + " costs " + price + " lei.");		
	}

}
