import java.util.*;

public class Deck {
    private List<Card> cards;
    private final int quantityCards = 76;
    private final int quantitySpecialCards = 32;

    Deck() {
        cards = new ArrayList<>();
        MakingCards(cards, "red", 0, 19);
        MakingCards(cards, "blue", 19, 38);
        MakingCards(cards, "green", 38, 57);
        MakingCards(cards, "yellow", 57, 76);
    }

    private void MakingCards(List<Card> cards, String color, int index, int x) {
        var y = 0;
        for (; index < x; index++, y++) {
            var card = new Card(y + "", color);
            cards.add(index, card);
            if (y == 9) {
                y = 0;
            }
        }
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
