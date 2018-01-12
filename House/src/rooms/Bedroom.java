package rooms;

import furniture.Bed;
import items.TV;
import utils.Color;

public class Bedroom extends Room{
	
	private Bed bed;
	private TV tv;
	
	public Bedroom(String size, Color color) throws Exception {
		switch (size) {
		case "big": {
			side1 = 120.0;
			side2 = 100.0;
			side3 = 90.0;
			side4 = 100.0;
			windows = 2;
			doors = 2;
			height = 220;
		}
			break;
		case "medium": {
			side1 = 80.0;
			side2 = 80.0;
			side3 = 80.0;
			side4 = 80.0;
			windows = 1;
			doors = 1;
			height = 190;
		}
			break;
		default:
			throw new Exception();
		}
		wallColor = color;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	public void addFurniture(Bed bed) {
		this.bed = bed;
	}
	
	
}
