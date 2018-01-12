package items;

import utils.Color;

public class TV extends Item{

	private short sizeInInchs;
	private String modelName;
	private long colorsCount;
	private String[] specifics;
	private double price;
	
	public TV(String modelName, long colorsCount, String[] specifics, double price,
			short sizeInInchs, String material, int year, Color color) {
		this.modelName = modelName;
		this.colorsCount = colorsCount;
		this.specifics = specifics;
		this.price = price;
		this.sizeInInchs = sizeInInchs;
		this.material = material;
		this.yearOfManifacture = year;
		this.color = color;
	}
	
	
	@Override
	public void turnOn() {
		isItOn = true;
		
	}

	@Override
	public void turnOff() {
		isItOn = false;
		
	}

}
