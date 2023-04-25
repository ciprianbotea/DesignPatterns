package classes;

import interfaces.FurnitureObject;

public abstract class AbstractFactory {
	
	public abstract FurnitureObject getObject (String objectName);
	
}
