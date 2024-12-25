import java.util.Scanner;

public class BackToSender{
	public static int calculateWage(int successfulDeliveries){
		
		int percentage = (successfulDeliveries * 100) / 100;
		int rate = 0;
		
		if (percentage < 50){
			rate = 160;
		}
		else if (percentage >= 50 && percentage <= 59){
			rate = 250;
		}
		else if (percentage >= 60 && percentage <= 69){
			rate = 400;
		}
		else if (percentage>= 70){
			rate = 500;
		}
		int totalWage = (successfulDeliveries * rate) + 5000;
	
	return totalWage;
	}
	
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of successful deliveries: ");
		int entry1 = input.nextInt();
		
		System.out.println("Wage for the day is: " + calculateWage(entry1));
	}
	
}