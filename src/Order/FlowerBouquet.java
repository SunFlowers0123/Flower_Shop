package Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Enum.Color;
import Enum.FlowerType;
import Enum.TypePlant;
import Flowers.Chamomile;
import Flowers.Daisy;
import Flowers.Rose;

public class FlowerBouquet {
	Random rand = new Random();
	TypePlant typePlant;
	private List<Offering>flowers = new ArrayList();
	
	public void addFlower(FlowerType flowerType) {
		double flowerPrice = Math.random()*(40-80)+80;
		int choiseColor=rand.nextInt(Color.values().length);
			
		switch(flowerType) {
			case ROSE:
				flowers.add(new Rose(flowerPrice, Color.values()[choiseColor] ));break;
			case CHAMOMILE :
				flowers.add(new Chamomile(flowerPrice, Color.values()[choiseColor] ));break;
			case DAISY : 
				flowers.add(new Daisy(flowerPrice, Color.values()[choiseColor] ));break;
		}
	
	}
	
	
	public void printYourBouquet() {
		flowers.stream().forEach(x->System.out.println(x));
	}
	
	public Double printBouquetSum() {
		return flowers.stream().
				map(Offering::getPrice).
				mapToDouble(Double::doubleValue).
				sum();
	}
	
}
