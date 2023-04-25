package classes;

import interfaces.UnitMeasure;

public class CubicMeter implements UnitMeasure{
	
	private String unitMeasure = "cubic meter";

	@Override
	public String type() {
		return unitMeasure;
	}

}
