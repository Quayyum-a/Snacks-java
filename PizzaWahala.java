import java.util.Scanner;

public class PizzaWahala {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int sapa = 4;
        int small = 6;
        int big = 8;
        int odogwu = 12;

        System.out.println("""
                Pizza Type    Number Of Slices    Price Per Box

                Sapa size          4              2,500

                Small money        6              2,900

                Big boys           8              4,000

                Odogwu            12              5,200
                """);

        System.out.print("Number of People: ");
        long numberOfPeople;
        if (input.hasNextLong()) {
            numberOfPeople = input.nextLong();
            if (numberOfPeople <= 0) {
                System.out.println("Error: Number of people must be greater than zero.");
                return;
            }
        } else {
            System.out.println("Error: Please enter a valid number.");
            return;
        }
        input.nextLine(); 

        System.out.print("Pizza Type: ");
        String pizzaType = input.nextLine();

        long numOfBoxes;
        long leftOver;
        long cost;

        switch (pizzaType.toLowerCase()) {
            case "sapa size" -> {
                numOfBoxes = (numberOfPeople + sapa - 1) / sapa;
                leftOver = numOfBoxes * sapa - numberOfPeople;
                cost = numOfBoxes * 2500L;
            }
            case "small money" -> {
                numOfBoxes = (numberOfPeople + small - 1) / small;
                leftOver = numOfBoxes * small - numberOfPeople;
                cost = numOfBoxes * 2900L;
            }
            case "big boys" -> {
                numOfBoxes = (numberOfPeople + big - 1) / big;
                leftOver = numOfBoxes * big - numberOfPeople;
                cost = numOfBoxes * 4000L;
            }
            case "odogwu" -> {
                numOfBoxes = (numberOfPeople + odogwu - 1) / odogwu;
                leftOver = numOfBoxes * odogwu - numberOfPeople;
                cost = numOfBoxes * 5200L;
            }
            default -> {
                System.out.println("Error: Invalid pizza type.");
                return;
            }
        }

        System.out.println("Pizza Type: " + pizzaType);
        System.out.println("Boxes to buy: " + numOfBoxes);
        System.out.println("Leftover slices: " + leftOver);
        System.out.println("Total cost: " + cost);

        input.close();
    }
}
