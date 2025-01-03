import java.util.ArrayList;
import java.util.Scanner;


public class CheckOutApp {
	 
public static void main(String... args) {
       Scanner input = new Scanner(System.in);

        System.out.println("How many customers did you attend to?");
        int customerCount = input.nextInt();
        input.nextLine();

        ArrayList<Product> cart = new ArrayList<>();
        double totalPrice = 0.0;
        String cashierName = "";

        for (int count = 0; count < customerCount; count++) {
            System.out.println("\nWhat is the customer's name: ");
            String customerName = input.nextLine();

            String response = "yes";
            while (response.equalsIgnoreCase("yes")) {
                System.out.println("What did the customer buy: ");
                String productName = input.nextLine();

                System.out.println("How many pieces: ");
                int quantity = input.nextInt();

                System.out.println("How much per unit: ");
                double unitPrice = input.nextDouble();
                input.nextLine(); 

                Product product = new Product(productName, quantity, unitPrice);
                cart.add(product);
                totalPrice += product.getTotalPrice();

                System.out.println("Add more items? (yes/no)");
                response = input.nextLine();
            }

            System.out.println("What is the cashier's name: ");
            cashierName = input.nextLine();

            System.out.println("Enter discount percentage (if any):");
            double discountPercentage = input.nextDouble();
            input.nextLine(); 

            double discount = (discountPercentage / 100) * totalPrice;
            double vat = 0.075 * totalPrice;
            double finalPrice = totalPrice - discount + vat;

            
            System.out.println("\n<<< SEMICOLON STORE >>>");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO-YABA, LAGOS");
            System.out.println("TEL: 03293828343");
            System.out.println("Date: " + java.time.LocalDateTime.now());
            System.out.println("Cashier: " + cashierName);
            System.out.println("Customer: " + customerName);

            System.out.printf("\n%-10s %-5s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL");
            for (Product product : cart) {
                System.out.println(product);
            }

            System.out.println("\nSubtotal: " + totalPrice);
            System.out.println("Discount: -" + discount);
            System.out.println("VAT (7.5%): +" + vat);
            System.out.println("Total: " + finalPrice);

            
            cart.clear();
            totalPrice = 0.0;
        }

   
    }
	 
}

