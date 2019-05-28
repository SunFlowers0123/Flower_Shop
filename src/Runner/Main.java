package Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Enum.CactusType;
import Enum.FlowerType;
import Enum.FlowerpotType;
import Enum.PaymentType;
import Enum.TreeType;
import Order.FactoryBouquet;
import Order.FlowerBouquet;
import Order.Shopper;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Shopper shopper = new Shopper();
		FactoryBouquet factoryBouquet = new FactoryBouquet();
		FlowerBouquet flowerBouquet = new FlowerBouquet();
		
		int choisePlant;
		int choiseFlower;
		int enough;
		int isPaid;
	
		
		System.out.println("\t\t\t Flower shop");
		System.out.println("Our catalog of plants : ");
		
		while(true) {
			System.out.println("1 - Flowers\n"
							 + "2 - Flowerpots\n"
							 + "3 - Trees\n"
							 + "4 - Cactus");
			choisePlant = scan.nextInt();
			switch(choisePlant) {
				case 1 :
					System.out.println("We have a bouquet : ");
					factoryBouquet.printBouquet();
					factoryBouquet.printBouquetSum();
					System.out.println("\n You can create bouquet for yourself : \n");
					while(true) {
						System.out.println(
								  "1 - Rose\n"
								+ "2 - Chamomile\n"
								+ "3 - Daisy\n");
						choiseFlower = scan.nextInt();
						switch (choiseFlower) {
							case 1: shopper.addFlowerToBasket(FlowerType.ROSE);break;
							case 2: shopper.addFlowerToBasket(FlowerType.CHAMOMILE);break;
							case 3: shopper.addFlowerToBasket(FlowerType.DAISY);break;
							default : System.out.println("We don`t have this flower");
						} 
						System.out.println("added");
						System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
						if(enough==1)break;
					}break;
				case 2 :
					System.out.println("We have a flowerpots :  ");

					while(true) {
						System.out.println(
								   "1 - Aloe\n"
								 + "2 - Ficus\n"
								 + "3 - Lemon\n");
						choiseFlower = scan.nextInt();
						
						switch(choiseFlower) {
						case 1 :
							shopper.addFlowerpotToBasket(FlowerpotType.ALOE);break;
						case 2 : 
							shopper.addFlowerpotToBasket(FlowerpotType.FICUS);break;
						case 3 : 
							shopper.addFlowerpotToBasket(FlowerpotType.LEMON);break;
						default : System.out.println("We don`t have this flowerpot");
					}
						System.out.println("added");
					System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
					if(enough==1) break; 
					}break;
				case 3 :
					System.out.println("We have a tree`s");
					
					while(true) {
					
						System.out.println(""
							+ "1 - Oak\n"
							+ "2 - Birch\n"
							+ "3 - Willow");
					
					choisePlant = scan.nextInt();
					
					switch(choisePlant) {
						case 1 :
							shopper.addTreesToBasket(TreeType.OAK);break;
						case 2 : 
							shopper.addTreesToBasket(TreeType.BIRCH);break;
						case 3 : 
							shopper.addTreesToBasket(TreeType.WILLOW);break;
						default : System.out.println("We don`t have this Tree");
					}
					System.out.println("added");
					System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
					if(enough==1) break;
					}break;
				case 4 :
					System.out.println("We have a cactus : ");
						while(true) {
						System.out.println("1 - cactus ");
						choisePlant = scan.nextInt();
						switch(choisePlant) {
							case 1 :
								shopper.addCactusToBasket(CactusType.CACTUS);break;
							default : System.out.println("we don`t have this cactus");
						}
						System.out.println("added");
						System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
						if(enough==1) break;
						}
				}
			System.out.println("If you wan`t to buy press 1 or 0 to continue...");
			enough=scan.nextInt();
			if(enough==1)break;
		}
		System.out.println("Press type of payment");
		System.out.println("1 - cash");
		System.out.println("2 - credit card");
		System.out.println("3 - paypal");
		isPaid = scan.nextInt();
		System.out.print("You paid for products : ");
		switch(isPaid){
			case 1 :
				System.out.println(shopper.payOff(PaymentType.CASH));break;
			case 2 : 
				System.out.println(shopper.payOff(PaymentType.CREDIT_CARD));break;
			case 3 : 
				System.out.println(shopper.payOff(PaymentType.PAYPAL));break;
			default : System.out.println("un paying");
		}
		
		System.out.println("Your plants : ");
		shopper.printBasket();
		System.out.print("The sum of plants : ");
		System.out.println(shopper.printBasketSum());
	
	}

}
