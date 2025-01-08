public class EvenPosition {
    public static void printEvenPositions(int[] numbers) {
        for (int count = 0; count < numbers.length; count += 2) {  
            System.out.println("The element at even position " + (count + 1) + " is: " + numbers[count]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 50, 60, 70, 80};
        printEvenPositions(numbers);
    }
}
