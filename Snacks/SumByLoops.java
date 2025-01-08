public class SumByLoops {
    public static int sumByForLoop(int[] array) {
        int sum = 0;
        for (int count = 0; count < array.length; count++) {
            sum += array[count];
        }
        return sum;
    }

    public static int sumByWhileLoop(int[] array) {
        int sum = 0;
        int count = 0;
        while (count < array.length) {
            sum += array[count];
            count++;
        }
        return sum;
    }

    public static int sumByDoWhileLoop(int[] array) {
        int sum = 0;
        int count = 0;
        do {
            sum += array[count];
            count++;
        } while (count < array.length);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        System.out.printf("Sum using For-Loop: %d%n", sumByForLoop(array));
        System.out.printf("Sum using While-Loop: %d%n", sumByWhileLoop(array));
        System.out.printf("Sum using Do While-Loop: %d%n", sumByDoWhileLoop(array));
    }
}
