package catalana.catalanacounter.parent;

public class ParenthesisCombinations {

    private static final int[] CATALAN_NUMBERS = new int[16];

    static {
        CATALAN_NUMBERS[0] = 1;
        for (int n = 1; n <= 15; n++) {
            long binomial = binomialCoefficient(2 * n, n);
            long result = binomial / (n + 1);
            if (result > Integer.MAX_VALUE) {
                throw new ArithmeticException("Result exceeds int range during initialization");
            }
            CATALAN_NUMBERS[n] = (int) result;
        }
    }

    public static int countWellFormedParenthesis(int nCouples) {
        if (nCouples < 1 || nCouples > 15) {
            throw new IllegalArgumentException("nCouples must be between 1 and 15");
        }
        return CATALAN_NUMBERS[nCouples];
    }

    private static long binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;

        k = Math.min(k, n - k);
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
            if (result > Integer.MAX_VALUE * (i + 2L)) {
                throw new ArithmeticException("Intermediate result exceeds int range");
            }
        }
        return result;
    }
}