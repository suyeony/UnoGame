import java.util.*;

public class Deck {
    private List<Card> cards;
    //    private final int quantityCards = 76;
//    private final int quantitySpecialCards = 32;
    private final Map<Integer, String> colors =
            Map.of(1, "red", 2, "blue", 3, "green", 4, "yellow");

    Deck() {
        cards = new ArrayList<>();
        for (String color : colors.values()) {
            MakingCards(cards, color);
            MakingSpecialCards(cards, color, Actions.ADD_TWO, "+2",2);
            MakingSpecialCards(cards, color, Actions.SKIP_TURN, "Skip",2);
            MakingSpecialCards(cards, color, Actions.REVERSE, "reverse",2);
        }
        MakingSpecialCards(cards,"none",Actions.CHOOSE_COLOR,"wild",4);
        MakingSpecialCards(cards,"none",Actions.ADD_FOUR,"+4",4);
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

    private void MakingSpecialCards(List<Card> cards, String color, Actions action, String value, int n) {
        for (int index = 0; index < n; index++) {
            var specialCard = new SpecialCard();
            specialCard.setColor(color);
            specialCard.setValue(value);
            specialCard.setActions(action);
            cards.add(specialCard);
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
