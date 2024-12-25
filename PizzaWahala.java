import java.util.Scanner;

public class PizzaWahala {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		int sapa = 4;
		int small = 6;
		int big = 8;
		int odogwu = 12;
		
		System.out.println(""" 
		
	Pizza Type    Number Of Slices    Price Per Box  
		
	Sapa size		4		2,500
		
	Small money		6		2,900
		
	Big boys		8		4,000
		
	Odogwu			12		5,200
		
		""");
		
		System.out.print("Number of People = ");
		int numberOfPeople = input.nextInt();
		input.nextLine();
		
		System.out.print("Pizza Type = ");
		String pizzaType = input.nextLine();
		
		String sapaSize = "Sapa size";
		if (pizzaType. equalsIgnoreCase(sapaSize)){
				
				System.out.println("");
				int numOfBoxes = (numberOfPeople + sapa - 1) / sapa;
				System.out.println("Boxes to buy: " + numOfBoxes);
				
				int leftOver = numOfBoxes * sapa;
				leftOver	-= numberOfPeople;
				System.out.println("left over is : " + leftOver);
				
				int cost = numOfBoxes * 2500;
				System.out.println("Total Cost is = " + cost);
			
		}
		
		String smallMoney = "Small money";
		if (pizzaType. equalsIgnoreCase(smallMoney)){
				
				System.out.println("");
				int numOfBoxes = (numberOfPeople + small - 1) / small;
				System.out.println("Boxes to buy: " + numOfBoxes);
				
				int leftOver = numOfBoxes * small;
				leftOver	-= numberOfPeople;
				System.out.println("left over is : " + leftOver);
				
				int cost = numOfBoxes * 2900;
				System.out.println("Total Cost is = " + cost);
			
		}
		
		String bigBoys = "Big boys";
		if (pizzaType. equalsIgnoreCase(bigBoys)){
				
				System.out.println("");
				int numOfBoxes = (numberOfPeople + big - 1) / big;
				System.out.println("Boxes to buy: " + numOfBoxes);
				
				int leftOver = numOfBoxes * big;
				leftOver	-= numberOfPeople;
				System.out.println("left over is : " + leftOver);
				
				int cost = numOfBoxes * 4000;
				System.out.println("Total Cost is = " + cost);
			
		}
		
		String odogwuS = "Odogwu";
		if (pizzaType. equalsIgnoreCase(odogwuS)){
				
				System.out.println("");
				int numOfBoxes = (numberOfPeople + odogwu - 1) / odogwu;
				System.out.println("Boxes to buy: " + numOfBoxes);
				
				int leftOver = numOfBoxes * odogwu;
				leftOver	-= numberOfPeople;
				System.out.println("left over is : " + leftOver);
				
				int cost = numOfBoxes * 5200;
				System.out.println("Total Cost is = " + cost);
			
		}
		
	}
}