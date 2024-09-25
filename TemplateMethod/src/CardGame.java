import java.util.*;

public class CardGame extends Game {
    private List<Integer> player1Deck;
    private List<Integer> player2Deck;
    private int player1Score;
    private int player2Score;

    @Override
    public void initializeGame(int numberOfPlayers) {
        if (numberOfPlayers != 2) {
            throw new IllegalArgumentException("This game requires exactly 2 players.");
        }

        List<Integer> deck = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(i);
            }
        }
        Collections.shuffle(deck);

        player1Deck = new ArrayList<>(deck.subList(0, 26));
        player2Deck = new ArrayList<>(deck.subList(26, 52));

        player1Score = 0;
        player2Score = 0;
        System.out.println("The game has been initialized with two players.");
    }

    @Override
    public boolean endOfGame() {
        return player1Deck.isEmpty() || player2Deck.isEmpty();
    }

    @Override
    public void playSingleTurn(int playerInTurn) {
        if (!player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int player1Card = player1Deck.remove(0);
            int player2Card = player2Deck.remove(0);

            System.out.println("Player 1 draws: " + cardValue(player1Card));
            System.out.println("Player 2 draws: " + cardValue(player2Card));

            if (player1Card > player2Card) {
                player1Score++;
                System.out.println("Player 1 wins this round!");
            } else if (player2Card > player1Card) {
                player2Score++;
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("It's a tie this round!");
            }

            System.out.println("Current Score -> Player 1: " + player1Score + ", Player 2: " + player2Score);
            System.out.println("----");
        }
    }

    @Override
    public void displayWinner() {
        System.out.println("Game over!");
        if (player1Score > player2Score) {
            System.out.println("Player 1 is the overall winner with " + player1Score + " points!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 is the overall winner with " + player2Score + " points!");
        } else {
            System.out.println("It's a tie! Both players have " + player1Score + " points.");
        }
    }

    private String cardValue(int card) {
        switch (card) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return String.valueOf(card);
        }
    }

    public static void main(String[] args) {
        // Created a CardGame object and called the play method with 2 players.
        // This main is not relevant for playing the game but is used for demonstration purposes.
        CardGame cardGame = new CardGame();
        cardGame.play(2);
    }
}
