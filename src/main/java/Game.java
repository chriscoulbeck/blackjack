import java.util.Scanner;

public class Game {
    private final Deck deck;
    private final Scanner scanner;
    private final Player player;

    public Game() {
        this.deck = new Deck();
        this.scanner = new Scanner(System.in);
        this.player = new Player();
    }

    /**
     * Main game loop.
     */
    public void play() {
        do {
            playRound();
            System.out.println("Play again? [y/n]");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("n")) {
                break;
            }
            resetGame();
        } while (true);
        System.out.println("Game over!");
    }

    /**
     * Resets the state of the deck and the player.
     */
    private void resetGame() {
        deck.reset();
        player.reset();
    }

    /**
     * Plays the current round.
     */
    public void playRound() {
        deck.shuffle();
        playersTurn();

    }

    public void playersTurn() {
        dealCardsToPlayer(2, player);
        System.out.println(player.getHand());
        System.out.println("Score: " + player.getScore());
        do {
            if (isBust(player.getScore())) {
                System.out.println("Bust");
                break;
            } else if (isBlackjack(player.getScore())) {
                System.out.println("Blackjack");
                break;
            }
            System.out.print("Hit or Stand? [h/s]: ");
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "h":
                    dealCardsToPlayer(1, player);
                    System.out.println(player.getHand());
                    System.out.println("Score: " + player.getScore());
                    break;
                case "s":
                    return;
                default:
                    System.out.println("Invalid input. Please enter 'h' for Hit or 's' for Stand.");
            }
        } while (true);
    }

    /**
     * Returns true if the specified score is greater than 21, false otherwise
     *
     * @param score the score to check
     * @return a {@code boolean} indicating whether the score is greater than 21
     */
    public boolean isBust(int score) {
        return score > 21;
    }

    /**
     * Returns true if the specified score is equal to 21, false otherwise.
     *
     * @param score the score to check
     * @return a {@code boolean} indicating whether the score is equal to 21
     */
    public boolean isBlackjack(int score) {
        return score == 21;
    }

    /**
     * Deals the specified number of cards to the specified player.
     *
     * @param numCards the number of cards to deal
     * @param player   the player to deal to
     */
    public void dealCardsToPlayer(int numCards, Player player) {
        for (int i = 0; i < numCards; i++) {
            var card = deck.drawCard();
            card.ifPresent(player::receiveCard);
        }
    }
}
