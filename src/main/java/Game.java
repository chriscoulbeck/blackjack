public class Game {
    private final Deck deck;

    public Game() {
        this.deck = new Deck();
    }

    public void play() {
        this.deck.shuffle();
    }
}
