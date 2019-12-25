import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDeck {
private static Deck deck = new Deck();
    @Test
    public void CreatingDeck() {
        for (int x = 0; x < deck.ShowCards().size(); x++) {
            System.out.println("This is one Card");
            System.out.println(deck.ShowCards().get(x).getValue());
            System.out.println(deck.ShowCards().get(x).getColor());

        }
    }
    @Test
    public  void mixCardTest(){
        deck.mixCard();
        for (int x = 0; x < deck.ShowCards().size(); x++) {
            System.out.println("This is one Card");
            System.out.println(deck.ShowCards().get(x).getValue());
            System.out.println(deck.ShowCards().get(x).getColor());

        }
    }
    @Test
    public void StartCardTest(){
        deck.mixCard();
        System.out.println("First seven cards");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(deck.ShowCards().get(x).getValue() + " ");
            System.out.print(deck.ShowCards().get(x).getColor() + " ");
        }
        List<Card> playerCards;
        playerCards = deck.StartCard();
        System.out.println("My cards");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(playerCards.get(x).getValue() + " ");
            System.out.print(playerCards.get(x).getColor() + " ");
        }
        System.out.println("First seven cards after removing");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(deck.ShowCards().get(x).getValue() + " ");
            System.out.print(deck.ShowCards().get(x).getColor() + " ");
        }

}
    @Test
    public void StartCardTwoPlayersTest(){
        List<Card> playerCards = new ArrayList<>();
        List<Card> playerCards2 = new ArrayList<>();
        Player p1 = new Player("Robot",playerCards);
        Player p2 = new Player("person", playerCards2);
        //Mixing Deck
        deck.mixCard();
        //Printing first seven cards on Deck
        System.out.println("First seven cards");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(deck.ShowCards().get(x).getValue() + " ");
            System.out.print(deck.ShowCards().get(x).getColor() + " ");
        }
        //Calling the StartCard method for player 1 (Robot)
        playerCards = deck.StartCard();
        //Printing my player 1's cards
        System.out.println(" ");
        System.out.println("Robot's cards");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(playerCards.get(x).getValue() + " ");
            System.out.print(playerCards.get(x).getColor() + " ");
        }
        //Printing next 7 cards on deck
        System.out.println(" ");
        System.out.println("First seven cards after removing");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(deck.ShowCards().get(x).getValue() + " ");
            System.out.print(deck.ShowCards().get(x).getColor() + " ");
        }
        //Call StartCard method for my second player (person)
        playerCards2 = deck.StartCard();
        System.out.println(" ");
        //Printing my second player's cards
        System.out.println("person's cards");
        for (int x = 0; x < 7 ;x++) {
            System.out.print(playerCards2.get(x).getValue() + " ");
            System.out.print(playerCards2.get(x).getColor() + " ");
        }

    }
    @Test
    public void DrawCardTest(){
        List<Card> playerCards = new ArrayList<>();
        Player player = new Player("Robot", playerCards);
        //Mixing the cards
        deck.mixCard();
        //Printing the first 7
        System.out.println(" ");
        System.out.println("This are the first cards on the deck");
        for (int x = 0; x < 8; x++) {
            System.out.print(deck.ShowCards().get(x).getValue() + " ");
            System.out.print(deck.ShowCards().get(x).getColor() + " ");
        }
        playerCards = deck.StartCard();
        //draw one cards
        deck.DrawCard(playerCards,1);
        //Print all my player's cards
        System.out.println(" ");
        System.out.println("person's cards");
        for (Card playerCard : playerCards) {
            System.out.print(playerCard.getValue() + " ");
            System.out.print(playerCard.getColor() + " ");
        }
    }
}
