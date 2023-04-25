package classes;

import abstractClasses.Varnish;

public class BeesWax extends Varnish{

	private String name = "Bees Wax";
	private float materialCost = 40.00f;
	private float quantity;
	
	public BeesWax(float quantity) {
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
