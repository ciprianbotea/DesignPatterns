package classes;

import abstractClasses.Cabinet;

public class SolidWood extends Cabinet{
	
	private String name = "Solid Wood";
	private float materialCost = 1000.00f;
	private float quantity;
	
	public SolidWood(float quantity) {
		this.quantity = quantity;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public float price() {
		return materialCost * quantity;
	}

	@Override
	public float quantity() {
		return quantity;
	}

}
