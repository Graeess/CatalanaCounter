package catalana.catalanacounter.TestParent.testprocess;

import catalana.catalanacounter.parent.ParenthesisCombinations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParenthesisPerformanceTest {
    @Test
    void testPerformanceBelow1ms() {
        long start = System.nanoTime();
        for (int i = 1; i <= 15; i++) {
            ParenthesisCombinations.countWellFormedParenthesis(i);
        }
        long end = System.nanoTime();
        double durationMs = (end - start) / 1_000_000.0;

        assertTrue(durationMs < 1, "Execution took too long: " + durationMs + " ms");
    }
}

