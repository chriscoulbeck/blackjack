import java.util.*;

public class Game {
    private final Deck deck;

    public Game() {
        List<Card> cards = createStandardCards();
        this.deck = new Deck(cards);
    }

    public void play() {
        this.deck.shuffle();
    }

    /**
     * Creates a list of standard playing cards with all combinations of {@link Rank} and {@link Suit}.
     *
     * @return a list of {@code Card} objects
     */
    private List<Card> createStandardCards() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }
}
