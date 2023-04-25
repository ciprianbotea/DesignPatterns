package abstractClasses;

import classes.Liter;
import interfaces.Material;
import interfaces.UnitMeasure;

public abstract class Varnish implements Material{
	
	public UnitMeasure unitMeasure() {
		return new Liter();
	}
	
	public abstract float price();

}
