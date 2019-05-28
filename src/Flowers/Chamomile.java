package Flowers;

import Enum.Color;
import Enum.FlowerType;
import Enum.TypePlant;
import Plants.AFlower;

public class Chamomile extends AFlower {
	private static final FlowerType FLOWER_TYPE = FlowerType.CHAMOMILE;
	private static final TypePlant TYPE_PLANT = TypePlant.CHAMOMILE;
	
	public Chamomile(Double price , Color color ) {
		super(FLOWER_TYPE, price , color,TYPE_PLANT);
	}

}
