package Trees;

import Enum.TreeType;
import Enum.TypePlant;
import Plants.ATree;

public class Oak extends ATree{
	private static final TreeType TREE_TYPE = TreeType.OAK;
	private static final TypePlant TYPE_PLANT = TypePlant.OAK;
	
	public Oak(Double price) {
		super(TREE_TYPE, price , TYPE_PLANT);
	}

}
