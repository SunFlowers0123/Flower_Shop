package Plants;

import Enum.FlowerpotType;
import Enum.OfferingType;
import Enum.TypePlant;
import Order.Offering;

public abstract class AFlowerpot extends Offering{
	private static final OfferingType OFFERING_TYPE = OfferingType.FLOWERPOT ;
	
	FlowerpotType flowerpotType ;
	public AFlowerpot(FlowerpotType flowerpotType , Double price , TypePlant typePlant ) {
		super(price , OFFERING_TYPE , typePlant);
		this.flowerpotType= flowerpotType;
	}		
	
	@Override
	public String toString() {
		return String.format("flowerpot Type - %s ,  price : %5.2f", flowerpotType, getPrice() );
	}
		
}

