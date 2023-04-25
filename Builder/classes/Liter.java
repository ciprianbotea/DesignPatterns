package classes;

import interfaces.UnitMeasure;

public class Liter implements UnitMeasure{
	
	private String unitMeasure = "liter";

	@Override
	public String type() {
		return unitMeasure;
	}
	

}
