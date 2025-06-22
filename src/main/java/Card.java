/**
 * Represents a playing card with a specific {@link Rank} and {@link Suit}.
 * Each card has an associated integer value which is derived from its rank.
 */
public class Card {
    /**
     * The rank of the card (e.g., TWO, KING, ACE)
     */
    private final Rank rank;
    /**
     * The suit of the card (e.g., DIAMONDS, CLUBS)
     */
    private final Suit suit;
    /**
     * The value of the card, used for scoring
     */
    private final int value;

    /**
     * Constructs a new {@code Card} with the specified rank and suit.
     * The card's value is derived from its rank.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.value = rank.getValue();
    }

    /**
     * Returns the rank of the card.
     *
     * @return the card's rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return the card's suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns the value of the card.
     *
     * @return the card's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a string representation of the card in the format "Rank of Suit".
     *
     * @return a human-readable representation of the card
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
