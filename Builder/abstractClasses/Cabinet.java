package abstractClasses;

import classes.CubicMeter;
import interfaces.Material;
import interfaces.UnitMeasure;

public abstract class Cabinet implements Material{
	
	public UnitMeasure unitMeasure() {
		return new CubicMeter();
	}
	
	public abstract float price();

}
