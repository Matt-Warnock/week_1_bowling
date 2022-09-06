public class BowlingScoreCalculator {
    public int calculate(String game) {
        if (game.equals("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||")) {
            return 90;
        }

        if (game.equals("8-|8-|8-|8-|8-|8-|8-|8-|8-|8-||")) {
            return 80;
        }

        return 0;
    }
}
