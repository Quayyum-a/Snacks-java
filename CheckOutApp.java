import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Product> cart = new ArrayList<>();
        double totalPrice = 0.0;

        System.out.println("\nWhat is the customer's name: ");
        String customerName = input.nextLine();

        String response = "yes";
        while (response.equalsIgnoreCase("yes")) {
            System.out.println("What did the customer buy: ");
            String productName = input.nextLine();

            int quantity = 0;
            while (true) {
                System.out.println("How many pieces: ");
                try {
                    quantity = Integer.parseInt(input.nextLine());
                    if (quantity > 0) break;
                    else System.out.println("Quantity must be positive. Try again.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry. Please enter a valid number.");
                }
            }

            double unitPrice = 0.0;
            while (true) {
                System.out.println("How much per unit: ");
                try {
                    unitPrice = Double.parseDouble(input.nextLine());
                    if (unitPrice > 0) break;
                    else System.out.println("Unit price must be positive. Try again.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry. Please enter a valid number.");
                }
            }

            Product product = new Product(productName, quantity, unitPrice);
            cart.add(product);
            totalPrice += product.getTotalPrice();

            System.out.println("Add more items? (yes/no): ");
            response = input.nextLine();
				
				while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
					System.out.println("Please enter a valid response (yes/no): ");
					response = input.nextLine();
					}
        }

        System.out.println("What is the cashier's name: ");
        String cashierName = input.nextLine();

        double discountPercentage = 0.0;
        while (true) {
            System.out.println("Enter discount percentage (if any):");
            try {
                discountPercentage = Double.parseDouble(input.nextLine());
                if (discountPercentage >= 0) break;
                else System.out.println("Discount percentage cannot be negative. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please enter a valid number.");
            }
        }

        double discount = (discountPercentage / 100) * totalPrice;
        double vat = 0.1750 * totalPrice;
        double finalPrice = totalPrice - discount + vat;

        System.out.println("\n<<< SEMICOLON STORE >>>");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO-YABA, LAGOS");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: " + java.time.LocalDateTime.now());
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer: " + customerName);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\n%-10s %-5s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL");
        System.out.println("-------------------------------------------------------------");

        for (Product product : cart) {
            System.out.println(product);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("\nSubtotal: %.2f%n", totalPrice);
        System.out.printf("Discount: -%.2f%n", discount);
        System.out.printf("VAT (17.50%%): +%.2f%n", vat);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Bill Total: %.2f%n", finalPrice);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("THIS IS NOT A RECEIPT, KINDLY PAY: %.2f%n", finalPrice);
        System.out.println("-------------------------------------------------------------");

        double payment = 0.0;
        while (true) {
            System.out.println("How much are you paying: ");
            try {
                payment = Double.parseDouble(input.nextLine());
                if (payment >= finalPrice) break;
                System.out.println("Amount is less than the total bill. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please enter a valid number.");
            }
        }

        double balance = payment - finalPrice;
        System.out.printf("Change: %.2f%n", balance);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Thank you for shopping at SEMICOLON STORE!");
        System.out.println("-------------------------------------------------------------");
    }
}

