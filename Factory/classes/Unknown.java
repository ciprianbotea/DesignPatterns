package classes;

import interfaces.FurnitureObject;

public class Unknown implements FurnitureObject {

	@Override
	public void getDetails() {
		System.out.println("Unknown furniture object!");
	}

}
