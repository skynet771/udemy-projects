package items;

import utils.Color;

public abstract class Item {
	
	protected String material;
	protected int yearOfManifacture;
	protected boolean isItOn;
	protected Color color;
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	
}
