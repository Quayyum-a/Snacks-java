import java.util.Scanner;

public class LargestElementFinder {
    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int count : array) {
            if (count > largest) {
                largest = count;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int entry = scanner.nextInt();

        int[] numbers = new int[entry];

        System.out.println("Enter " + entry + " numbers:");
        for (int count = 0; count < entry; count++) {
            System.out.print("Number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
        }

        int largest = findLargest(numbers);
        System.out.println("The largest element is: " + largest);
    }
}
