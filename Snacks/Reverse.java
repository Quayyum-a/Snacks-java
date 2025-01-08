public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversed = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        
        System.out.println("Reversed Array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
