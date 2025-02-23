import java.util.Scanner;

public class CompoundInterestCalculator {
    public static double calculateCompoundinterest(double principal, double monthlyContribution, double annualRate, int years, int compoundFrequency) {
        double amount = principal * Math.pow(1 + annualRate / compoundFrequency, compoundFrequency * years);
        for (int count = 1; count <= years * 12; count++) {
            amount += monthlyContribution * Math.pow(1 + annualRate / compoundFrequency, compoundFrequency * (years - (count / 12.0)));
        }
        return amount;
    }

    public static void main(String... args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter Your Initial Investment: ");
        double principal = entry.nextDouble();

        System.out.print("Enter Monthly Contribution: ");
        double monthlyContribution = entry.nextDouble();

        System.out.print("Enter Length Of Times In Years: ");
        int years = entry.nextInt();

        System.out.print("Enter The Estimated Annual Interest Rate: ");
        double annualRate = entry.nextDouble() / 100;

        System.out.print("Enter The Interest Rate Variance Range: ");
        double varianceRange = entry.nextDouble() / 100;

        System.out.println("Select Compounding Frequency:");
        System.out.println("1. Annually");
        System.out.println("2. Quarterly");
        System.out.println("3. Monthly");
        System.out.println("4. Weekly");
        System.out.println("5. Daily");
        int frequencyChoice = entry.nextInt();

        int compoundFrequency;
        switch (frequencyChoice) {
            case 1 -> compoundFrequency = 1; 
            case 2 -> compoundFrequency = 4; 
            case 3 -> compoundFrequency = 12; 
            case 4 -> compoundFrequency = 52; 
            case 5 -> compoundFrequency = 365; 
            default -> {
                System.out.println("Invalid choice. Defaulting to Annual compounding.");
                compoundFrequency = 1;
            }
        }

        double amount = calculateCompoundinterest(principal, monthlyContribution, annualRate, years, compoundFrequency);

        System.out.println();
        System.out.printf("The total future investment value after %d years is: %.2f%n", years, amount);
    }
}
