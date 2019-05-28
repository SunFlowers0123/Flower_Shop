package Plants;

import Enum.OfferingType;
import Enum.TreeType;
import Enum.TypePlant;
import Order.Offering;

public abstract class ATree extends Offering{
	private static final OfferingType OFFERING_TYPE = OfferingType.TREE;
	
	TreeType treeType; 
	
	public ATree(TreeType treeType , Double price , TypePlant typePlant ) {
		super(price , OFFERING_TYPE , typePlant);
		this.treeType=treeType;
	}
	
	@Override
	public String toString() {
		return String.format("flowerpot Type - %s ,  price : %5.2f", treeType, getPrice() );
	}
	
}
