public class RunningTotal {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 50, 60, 70, 80};

        calculateRunningTotal(numbers);
    }

    
    public static void calculateRunningTotal(int[] numbers) {
        int total = 0;
        for (int count = 0; count < numbers.length; count++) {
            total += numbers[count];
            System.out.println("The running total after loop " + (count + 1) + " is: " + total);
        }
    }
}
