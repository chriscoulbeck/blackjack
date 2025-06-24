import java.util.*;

/**
 * Represents a deck of playing cards that supports shuffling and dealing.
 * <p>
 * Cards are dealt from the top of the deck, and can be shuffled into random order.
 * </p>
 */
public class Deck {
    private final Deque<Card> cards;

    /**
     * Constructs a standard {@code Deck} of playing cards.
     */
    public Deck() {
        this.cards = new ArrayDeque<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.addLast(new Card(rank, suit));
            }
        }
    }

    /**
     * Randomly shuffles the order of the cards in the deck.
     */
    public void shuffle() {
        List<Card> cardList = new ArrayList<>(cards);
        Collections.shuffle(cardList);
        this.cards.clear();
        this.cards.addAll(cardList);
    }

    /**
     * Draws (removes and returns) the top card from the deck.
     * <p>
     * If the deck is empty, returns an {@link Optional#empty()}.
     * </p>
     *
     * @return an {@link Optional} containing the top {@link Card}, or {@link Optional#empty()} if the deck is empty
     */
    public Optional<Card> drawCard() {
        if (cards.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(cards.pop());
    }
}
