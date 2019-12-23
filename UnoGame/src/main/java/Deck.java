import java.util.*;

public class Deck {
    private List<Card> cards;
    private final int quantityCards = 76;
    private final int quantitySpecialCards = 32;

    Deck() {
        cards = new ArrayList<Card>();
        MakingCards(cards, "red");
//        MakingCards(cards, "blue");
//        MakingCards(cards, "green");
//        MakingCards(cards, "yellow");
    }

    private List<Card> MakingCards(List<Card> cards, String color) {
        int y = 0;
        for (int i = 0; i < 19; i++, y++) {
            Card card = new Card();
            card.setColor(color);
            card.setValue(y + "");
            cards.add(i, card);
            if (y == 9) {
                y = 0;
            }
        }
        return cards;
    }

    public List<Card> ShowCards() {
        return cards;
    }
//
//    public drawCard() {
//
//    }
//
//    public mixCard() {
//
//    }
//
//    public giveCard() {
//
//    }
//
//    public startCard() {
//
//    }

}
