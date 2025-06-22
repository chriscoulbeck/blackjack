/**
 * Represents the rank of a playing card.
 * Each rank has an associated integer value used for scoring.
 */
public enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

    /**
     * The value associated with the rank.
     */
    private final int value;

    /**
     * Constructs a {@code Rank} with the specified value.
     *
     * @param value the integer value associated with the rank
     */
    Rank(int value) {
        this.value = value;
    }

    /**
     * Returns the value associated with the rank.
     *
     * @return the value of the rank
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a human-readable string representation of the rank.
     * e.g., "ACE", "TWO", or "KING" will be formatted as "Ace", "Two", or "King".
     *
     * @return a formatted name of the rank
     */
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
