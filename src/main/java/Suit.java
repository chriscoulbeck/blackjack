/**
 * Represents the suit of a playing card.
 */
public enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    /**
     * Returns a human-readable string representation of the suit.
     * e.g., "HEARTS", or "CLUBS" will be formatted as "Hearts", or "Clubs".
     *
     * @return a formatted name of the suit
     */
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
