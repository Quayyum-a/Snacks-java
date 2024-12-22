public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        
        int[] reversed = new int[array.length];
        
        for (int count = array.length - 1; count >= 0; count--) {
            reversed[count++] = array[count];
        }
        
        
        System.out.println("Reversed Array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
