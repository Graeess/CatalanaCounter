package catalana.catalanacounter.TestParent;
import catalana.catalanacounter.parent.ParenthesisCombinations;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ParenthesisCombinationsTest {

    @Test
    void testValidCatalanValues() {
        assertEquals(1, ParenthesisCombinations.countWellFormedParenthesis(1));
        assertEquals(2, ParenthesisCombinations.countWellFormedParenthesis(2));
        assertEquals(5, ParenthesisCombinations.countWellFormedParenthesis(3));
        assertEquals(14, ParenthesisCombinations.countWellFormedParenthesis(4));
        assertEquals(42, ParenthesisCombinations.countWellFormedParenthesis(5));
        assertEquals(132, ParenthesisCombinations.countWellFormedParenthesis(6));
        assertEquals(429, ParenthesisCombinations.countWellFormedParenthesis(7));
        assertEquals(1430, ParenthesisCombinations.countWellFormedParenthesis(8));
        assertEquals(4862, ParenthesisCombinations.countWellFormedParenthesis(9));
        assertEquals(16796, ParenthesisCombinations.countWellFormedParenthesis(10));
        assertEquals(58786, ParenthesisCombinations.countWellFormedParenthesis(11));
        assertEquals(208012, ParenthesisCombinations.countWellFormedParenthesis(12));
        assertEquals(742900, ParenthesisCombinations.countWellFormedParenthesis(13));
        assertEquals(2674440, ParenthesisCombinations.countWellFormedParenthesis(14));
        assertEquals(9694845, ParenthesisCombinations.countWellFormedParenthesis(15));
    }

}