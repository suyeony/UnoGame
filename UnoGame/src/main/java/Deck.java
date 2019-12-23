import java.util.*;

public class Deck {
    private List<Card> cards;
    private final int quantityCards = 76;
    private final int quantitySpecialCards = 32;
    private final Map<Integer, String> colors =
            Map.of(1, "red", 2, "blue", 3, "green", 4, "yellow");

    Deck() {
        cards = new ArrayList<>();
        for (String color : colors.values()) {
            MakingCards(cards, color);
        }
//        MakingSpecialCards(cards, "red", Actions.ADD_TWO, "+2");
//        MakingSpecialCards(cards, "blue", Actions.ADD_TWO, "+2");
//        MakingSpecialCards(cards, "green", Actions.ADD_TWO, "+2");
//        MakingSpecialCards(cards, "red", Actions.ADD_TWO, "+2");
    }

    private void MakingCards(List<Card> cards, String color) {
        var y = 0;
        for (int index = 0; index < 19; index++, y++) {
            var card = new Card(y + "", color);
            cards.add(card);
            if (y == 9) {
                y = 0;
            }
        }
    }

    private void MakingSpecialCards(List<Card> cards, String color, Actions action, String value) {
        var specialCard = new SpecialCard();
        specialCard.setColor(color); // 8 none 24 color, 6blue, 6green, 6yellow, 6red
        specialCard.setValue("+2"); // +2, wild, +4, reverse, skip   24 + 8
        specialCard.setActions(Actions.ADD_FOUR);
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
