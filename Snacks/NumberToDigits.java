import java.util.ArrayList;
import java.util.List;

public class NumberToDigits {
    public static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(0, number % 10);
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int number = 2342;
        System.out.println("Digits: " + getDigits(number));
    }
}
