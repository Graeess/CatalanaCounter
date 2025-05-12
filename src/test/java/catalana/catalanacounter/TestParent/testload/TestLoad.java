package catalana.catalanacounter.TestParent.testload;

import catalana.catalanacounter.parent.ParenthesisCombinations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLoad {

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 16, 100})
    void testInvalidInputs(int input) {

        for (int i = 0; i < 15; i++) {
            try {
                ParenthesisCombinations.countWellFormedParenthesis(input);
            } catch (Exception ignored) {

            }
        }


        assertThrows(IllegalArgumentException.class, () ->
                ParenthesisCombinations.countWellFormedParenthesis(input));
    }
}
