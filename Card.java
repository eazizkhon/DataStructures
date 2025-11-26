public class Card implements Comparable<Card> {

    private int rank;   // 2..14 (11=Jack, 12=Queen, 13=King, 14=Ace)
    private int suit;   // 0..3 (0=Clubs, 1=Diamonds, 2=Hearts, 3=Spades)

    // Make a random card
    public Card() {
        rank = 2 + (int)(Math.random() * 13);
        suit = (int)(Math.random() * 4);
    }

    // Compare cards by rank only
    public int compareTo(Card other) {
        return this.rank - other.rank;
    }

    // Turn the card into words like "9 of Hearts"
    public String toString() {
        String rankName;
        switch (rank) {
            case 11: rankName = "Jack";  break;
            case 12: rankName = "Queen"; break;
            case 13: rankName = "King";  break;
            case 14: rankName = "Ace";   break;
            default: rankName = String.valueOf(rank);
        }

        String suitName;
        switch (suit) {
            case 0: suitName = "Clubs";    break;
            case 1: suitName = "Diamonds"; break;
            case 2: suitName = "Hearts";   break;
            default: suitName = "Spades";
        }

        return rankName + " of " + suitName;
    }
}
