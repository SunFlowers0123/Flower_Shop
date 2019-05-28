package Flowerpots;

import Enum.FlowerpotType;
import Enum.TypePlant;
import Plants.AFlowerpot;

public  class Lemon extends AFlowerpot{
	private static final FlowerpotType FLOWERPOT_TYPE = FlowerpotType.LEMON;
	private static final TypePlant TYPE_PLANT = TypePlant.LEMON;
	
	public Lemon(Double price) {
		super(FLOWERPOT_TYPE,price , TYPE_PLANT);
	}
	
//	@Override
//	public String toString() {
//		return String.format("name - %s , color - %s , price : %.2f",  color, price);
//	}

}
