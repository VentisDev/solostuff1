package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class divisiblenumberselite {
    public static int divisibleNumbers(int n) {
        int temp = n;
        for (int i=n; i>0; i--) {
            if (!containsZero(i) && (n % i == 0)) {
                n = temp;
                if (isSumGreaterThanProduct(i)) {
                    int length = (int) Math.log10(i) + 1;
                    return length;
                }
            }
        }
        return -1;

    }

    private static boolean containsZero(int n) {
        while (n >= 10) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }

    private static boolean isSumGreaterThanProduct(int n) {
        List<Integer> numbers = new ArrayList<>();
        while (n > 10) {
            int temp = n % 10; //505 , reminder 5, n = 50, 5 + 0 + 5 = 10, but 1x5x5x0=0
            n /= 10;
            numbers.add(temp);
        }

        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum+= number;
            product *= number;
        }
        return sum >= product;
    }
}
