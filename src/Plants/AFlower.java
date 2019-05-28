package Plants;

import Enum.Color;
import Enum.FlowerType;
import Enum.OfferingType;
import Enum.TypePlant;
import Order.Offering;

public abstract class AFlower extends Offering{
	private static final OfferingType OFFERINGTYPE = OfferingType.FLOWER;	
	
	private FlowerType flowerType;
	private Color color;
	
	public AFlower( FlowerType flowerType , Double price , Color color , TypePlant typePlant) {
		super(price, OFFERINGTYPE , typePlant );
		this.flowerType=flowerType;
		this.color = color;
	}
	
	private Color getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return String.format(" flower type - %s , price : %5.2f , color - %s ",  flowerType , getPrice() , getColor());
	}
	
}
