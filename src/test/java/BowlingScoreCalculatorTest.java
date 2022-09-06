import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingScoreCalculatorTest {

    @Test
    void game_of_nines() {
        String game = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";
        BowlingScoreCalculator bowlingScoreCalculator = new BowlingScoreCalculator();
        int expectedResult = 90;

        int result = bowlingScoreCalculator.calculate(game);

        assertEquals(expectedResult, result);
    }

    @Test
    void game_of_eights() {
        String game = "8-|8-|8-|8-|8-|8-|8-|8-|8-|8-||";
        BowlingScoreCalculator bowlingScoreCalculator = new BowlingScoreCalculator();
        int expectedResult = 80;

        int result = bowlingScoreCalculator.calculate(game);

        assertEquals(expectedResult, result);
    }

    @Test
    void game_of_sevens() {
        String game = "7-|7-|7-|7-|7-|7-|7-|7-|7-|7-||";
        BowlingScoreCalculator bowlingScoreCalculator = new BowlingScoreCalculator();
        int expectedResult = 70;

        int result = bowlingScoreCalculator.calculate(game);

        assertEquals(expectedResult, result);
    }

}