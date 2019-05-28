package Order;

import Enum.OfferingType;
import Enum.TypePlant;

public abstract class Offering {
	
	private TypePlant typePlant;
	private OfferingType offeringType;
	private double price ;
	
	public Offering(Double price , OfferingType offeringType , TypePlant typePlant) {
		
		this.price = price;
		this.offeringType = offeringType;
		this.typePlant=typePlant;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public OfferingType getOfferingType() {
		return offeringType;
	}
	
	public TypePlant getTypePlant() {
		return typePlant;
	}
	
}
