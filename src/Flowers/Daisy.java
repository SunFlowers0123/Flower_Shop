package Flowers;

import Enum.Color;
import Enum.FlowerType;
import Enum.TypePlant;
import Plants.AFlower;

public class Daisy extends AFlower {
	private static final FlowerType FLOWER_TYPE = FlowerType.DAISY;
	private static final TypePlant TYPE_PLANT = TypePlant.DAISY;
	
	public Daisy(Double price , Color color) {
		super(FLOWER_TYPE, price , color , TYPE_PLANT );
	}
	
}

