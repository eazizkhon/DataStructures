import java.util.Arrays;

public class Hand {

    private Card[] cards;   // array of 5 cards

    // Constructor: create 5 random cards and sort them
    public Hand() {
        cards = new Card[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = new Card();  // new random card
        }
        Arrays.sort(cards);         // sort by rank
    }

    // Search for card with same rank
    public boolean inHand(Card searchCard) {
        for (int i = 0; i < 5; i++) {
            if (cards[i].compareTo(searchCard) == 0) {
                return true;
            }
        }
        return false;
    }

    // String representation of the 5 cards
    public String toString() {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += cards[i] + "  ";
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {

        Hand hand = new Hand();   // 5 random sorted cards

        System.out.println("Hand of 5 cards (sorted by rank): " + hand);

        // Generate 10 random cards
        for (int i = 1; i <= 10; i++) {

            Card randomCard = new Card();
            boolean found = hand.inHand(randomCard);

            if (found) {
                System.out.println("Random card " + i + ": " + randomCard +
                                   " - Positive, the card is contained in the hand");
            } else {
                System.out.println("Random card " + i + ": " + randomCard +
                                   " - Negative, the card is not contained in the hand");
            }
        }
    }
}
