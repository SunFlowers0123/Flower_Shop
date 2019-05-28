package Cactus;

import Enum.CactusType;
import Enum.FlowerpotType;
import Enum.TypePlant;
import Plants.ACactus;
import Plants.AFlowerpot;

public class Cactus extends ACactus{
	private static final CactusType CACTUS_TYPE = CactusType.CACTUS;
	private static final TypePlant TYPE_PLANT = TypePlant.DAISY;
	
	public Cactus(Double price) {
		super(CACTUS_TYPE,price , TYPE_PLANT);
	}
	
//	@Override
//	public String toString() {
//	return String.format("name - %s , color - %s , price : %.2f",  color, price);
//}

}
