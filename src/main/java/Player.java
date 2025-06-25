import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the game. A {@code Player} has a hand of cards and keeps track of their current score.
 */
public class Player {
    private final List<Card> hand = new ArrayList<>();
    private int score = 0;

    /**
     * Returns the player's hand.
     *
     * @return a list of {@code Card} objects
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Returns the player's score.
     *
     * @return an integer representing the player's score
     */
    public int getScore() {
        return score;
    }

    /**
     * Adds the card to the player's hand and adds the value of the card to the score.
     *
     * @param card the {@link Card} to add to the player's hand
     */
    public void receiveCard(Card card) {
        hand.add(card);
        score += card.getValue();
    }
}
