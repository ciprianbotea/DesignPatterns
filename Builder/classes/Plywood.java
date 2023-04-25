package classes;

import abstractClasses.Cabinet;

public class Plywood extends Cabinet{
	
	private String name = "Plywood";
	private float materialCost = 600.00f;
	private float quantity;
	
	public Plywood(float quantity) {
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
