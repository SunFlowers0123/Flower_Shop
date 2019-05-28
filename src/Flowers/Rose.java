package Flowers;

import Enum.Color;
import Enum.FlowerType;
import Enum.TypePlant;
import Plants.AFlower;

public class Rose extends AFlower{
	private static final FlowerType FLOWER_TYPE = FlowerType.ROSE;
	private static final TypePlant TYPE_PLANT = TypePlant.DAISY;
	
	public Rose(Double price , Color color) {
		super(FLOWER_TYPE, price , color , TYPE_PLANT);
	}
	
	

	
}
