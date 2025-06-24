import java.util.*;

/**
 * Represents a deck of playing cards that supports shuffling and dealing.
 * <p>
 * Cards are dealt from the top of the deck.
 * The deck can be initialized with a predefined list of cards, excluding {@code null} entries,
 * and can be shuffled into random order.
 * </p>
 */
public class Deck {
    private final Deque<Card> cards;

    /**
     * Constructs a {@code Deck} initialized with the specified list of cards, filtering out any {@code null} entries.
     * <p>
     * The cards are added to the bottom of the deck in the order they appear in the provided list.
     * </p>
     *
     * @param cardList the list of {@code Card} objects to initialize the deck with
     * @throws NullPointerException if {@code cardList} is {@code null}
     */
    public Deck(List<Card> cardList) {
        Objects.requireNonNull(cardList, "cardList must not be null");
        this.cards = new ArrayDeque<>();
        for (Card card : cardList) {
            if (card != null) {
                this.cards.addLast(card);
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
