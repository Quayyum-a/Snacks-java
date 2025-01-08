import java.util.Scanner;

public class ElementChecker {
    public static boolean ElementInList(int[] list, int element) {
        for (int count = 0; count < list.length; count++) {
            if (list[count] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Please enter the element you want from 1 - 10: ");
        int target = input.nextInt();

        boolean result = ElementInList(list, target);
        System.out.println("Is element " + target + " in the list? " + result);
    }
}
