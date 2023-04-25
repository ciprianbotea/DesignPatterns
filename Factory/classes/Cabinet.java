package classes;

import interfaces.FurnitureObject;

public class Cabinet implements FurnitureObject{
	
	String name = "cabinet";
	Double price = 900.00;
	
	@Override
	public void getDetails() {
		System.out.println("The " + name + " costs " + price + " lei.");	
	}

}
