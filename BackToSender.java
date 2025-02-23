import java.util.Scanner;

public class BackToSender {
    public static int calculateWage(int successfulDeliveries) {
        int perParcel = 0;
        
        if (successfulDeliveries < 50) {
            perParcel = 160;
        } else if (successfulDeliveries <= 59) {
            perParcel = 200;
        } else if (successfulDeliveries <= 69) {
            perParcel = 250;
        } else {
            perParcel = 500;
        }
        
        return (successfulDeliveries * perParcel) + 5000;
    }
    
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of successful deliveries: ");
        int entry1 = input.nextInt();
        System.out.println("Wage for the day is: " + calculateWage(entry1));
    }
}