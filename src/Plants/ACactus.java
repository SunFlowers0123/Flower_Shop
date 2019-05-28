package Plants;

import Enum.CactusType;
import Enum.FlowerpotType;
import Enum.OfferingType;
import Enum.TypePlant;
import Order.Offering;

public abstract class ACactus extends Offering{
	private static final OfferingType OFFERING_TYPE = OfferingType.CACTUS ;
	private static final TypePlant TYPE_PLANT = TypePlant.CACTUS;

	CactusType cactusType;
	public ACactus(CactusType cactusType ,Double price , TypePlant typePlant ) {
		super(price , OFFERING_TYPE , typePlant);
		this.cactusType=cactusType;
	}

	@Override
	public String toString() {
		return String.format("Cactus type  - %s, price : %5.2f",cactusType, getPrice() );
	}
	
}
