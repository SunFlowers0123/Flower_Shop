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

public class FactoryBouquet {
	
private Random rand = new Random();
	
	private List<Offering> flowers = new ArrayList(14);
	
	public FactoryBouquet() {
		bouquet();
	}
	
	private void bouquet() {
		int howManyFlowers = rand.nextInt(14)+1;
		int whichFlower=rand.nextInt(3)+1;
		int choiseColor;
		double bouquetPrice ;
		for(int i=0 ;i<howManyFlowers;i++) {
			whichFlower=rand.nextInt(3)+1;
			bouquetPrice=Math.random()*(40-80)+80;
			choiseColor=rand.nextInt(Color.values().length);
			switch(whichFlower) {
				case 1:
					flowers.add(new Chamomile(bouquetPrice,Color.values()[choiseColor]));break;
				case 2:
					flowers.add(new Rose(bouquetPrice,Color.values()[choiseColor]));break;
				case 3:
					flowers.add(new Daisy(bouquetPrice,Color.values()[choiseColor]));break;
			}
		}
	}
	
	
	
	public void printBouquet() {
		flowers.stream().forEach(x->System.out.println(x));
	}
	
	private Double BouquetSum() {
		return flowers.stream()
		.map(Offering::getPrice)
		.mapToDouble(Double::doubleValue)
		.sum();
	}
	
	public void printBouquetSum() {
		System.out.println(String.format("Bouquet price : %.2f", BouquetSum()));
	}
}
