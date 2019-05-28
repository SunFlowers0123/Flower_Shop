package Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Cactus.Cactus;
import Enum.CactusType;
import Enum.Color;
import Enum.FlowerType;
import Enum.FlowerpotType;
import Enum.PaymentType;
import Enum.TreeType;
import Flowerpots.Aloe;
import Flowerpots.Ficus;
import Flowerpots.Lemon;
import Flowers.Chamomile;
import Flowers.Daisy;
import Flowers.Rose;
import Trees.Birch;
import Trees.Oak;
import Trees.Willow;

public class Shopper {
	
	Basket basket = new Basket();
	Account account = new Account();
	FactoryBouquet bouquet = new FactoryBouquet();
	
	Random rand = new Random();
	
	public void addFlowerToBasket(FlowerType flowerType) {
		double flowerPrice = Math.random()*(40-80)+80;
		int choiseColor=rand.nextInt(Color.values().length);
			
		switch(flowerType) {
			case ROSE:
				basket.addFlowers((new Rose(flowerPrice, Color.values()[choiseColor] )));break;
			case CHAMOMILE :
				basket.addFlowers(new Chamomile(flowerPrice, Color.values()[choiseColor] ));break;
			case DAISY : 
				basket.addFlowers(new Daisy(flowerPrice, Color.values()[choiseColor] ));break;
		}
	}
	
	public void addFlowerpotToBasket(FlowerpotType flowerpotType) {
		double flowerPrice = Math.random()*(50-120)+120;
		
		switch(flowerpotType) {
		case ALOE :
			basket.addFlowerpot(new Aloe(flowerPrice));break;
		case FICUS :
			basket.addFlowerpot(new Ficus(flowerPrice));break;
		case LEMON : 
			basket.addFlowerpot(new Lemon(flowerPrice)); break;
		}
	}
	
	public void addTreesToBasket(TreeType treeType) {
		double flowerPrice = Math.random()*(110-200)+200;
		
		switch(treeType) {
		case OAK :
			basket.addTrees(new Oak(flowerPrice));break;
		case BIRCH :
			basket.addTrees(new Birch(flowerPrice));break;
		case WILLOW : 
			basket.addTrees(new Willow(flowerPrice)); break;
		}
	}
	
	public void addCactusToBasket(CactusType cactusType) {
		double flowerPrice = Math.random()*(25-75)+75;
		switch(cactusType) {
		case CACTUS :
			basket.addCactus(new Cactus(flowerPrice));break;
		}
	}
	
	public void printBasket() {
		basket.printContentsBasket();
	}
	
	public Double printBasketSum() {
		return basket.printBasketSum();
	}
	
	public boolean payOff(PaymentType paymentType) {
		return account.pay(paymentType);
	}
	
	
	
class Account{

	public boolean pay(PaymentType paymentType) {
		boolean isPaid=false;
		switch(paymentType) {
			case CASH :
				isPaid = true;
			case CREDIT_CARD:
				isPaid = true;
			case PAYPAL :
				isPaid = true;
		}
		return isPaid;
	}
	
}

}
