package catalana.catalanacounter.TestParent.manualchek;

import catalana.catalanacounter.parent.ParenthesisCombinations;

public class ManualCheck {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int result = ParenthesisCombinations.countWellFormedParenthesis(i);
            System.out.printf("C(%d) = %d%n", i, result);
        }
    }
}
