package classes;

import abstractClasses.Varnish;

public class DanishOil extends Varnish{

	private String name = "Danish Oil";
	private float materialCost = 60.00f;
	private float quantity;
	
	public DanishOil(float quantity) {
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
