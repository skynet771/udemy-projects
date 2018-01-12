package furniture;

import utils.Color;

public class RoyalBed extends Bed{

	private final String name = "RoyalBed";
	
	public RoyalBed() {
		bottomAndTopSize = 95.0;
		leftAndRightSize = 210.0;
		material = "wood";
		color = Color.RED;
	}
}
