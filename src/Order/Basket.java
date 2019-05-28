package Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Enum.TypePlant;
import Plants.ACactus;
import Plants.AFlowerpot;
import Plants.ATree;
import Trees.Oak;

public class Basket {

	Random rand = new Random();
	TypePlant typePlant;
	private List<Offering>basket = new ArrayList();
	
	public void addFlowers(Offering flowers) {
		basket.add(flowers);
	}
	
	public void addBouquet (Offering flowerBouquet) {
		basket.add(flowerBouquet);
	}
	
	public void addCactus (ACactus cactus) {
		basket.add(cactus);
	}
	
	public void addFlowerpot (AFlowerpot flowerpots) {
		basket.add(flowerpots);
	}
	
	public void addTrees (ATree offering) {
		basket.add(offering);
	}
	
	
	public void printContentsBasket() {
		basket.stream().forEach(x->System.out.println(x));
	}
	
	public Double printBasketSum() {
		return basket.stream().
				map(Offering::getPrice).
				mapToDouble(Double::doubleValue).
				sum();
	}
	
	
	
}
