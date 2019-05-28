package Trees;

import Enum.TreeType;
import Enum.TypePlant;
import Plants.ATree;

public class Willow extends ATree{
	private static final TreeType TREE_TYPE = TreeType.WILLOW;
	private static final TypePlant TYPE_PLANT = TypePlant.WILLOW;
	
	public Willow(Double price) {
		super(TREE_TYPE, price , TYPE_PLANT );
	}

}
