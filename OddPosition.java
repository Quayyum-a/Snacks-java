public class OddPosition {
    
    public static void printOddPositions(int[] numbers) {
        for (int count = 1; count < numbers.length; count += 2) {  
            System.out.println("The element at odd position " + (count + 1) + " is: " + numbers[count]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {20, 30, 40, 50, 60, 70, 80};
        
        
        printOddPositions(numbers);
    }
}
