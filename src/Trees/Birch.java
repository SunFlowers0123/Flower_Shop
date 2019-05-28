package Trees;

import Enum.TreeType;
import Enum.TypePlant;
import Plants.ATree;

public class Birch extends ATree{
	private static final TreeType TREE_TYPE = TreeType.BIRCH;
	private static final TypePlant TYPE_PLANT = TypePlant.BIRCH;
	
	public Birch(Double price) {
		super(TREE_TYPE, price , TYPE_PLANT);
	}

}
