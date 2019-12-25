import org.junit.Test;

public class TestDeck {

    @Test
    public void CreatingDeck() {
        Deck deck = new Deck();
        for (int x = 0; x < deck.ShowCards().size(); x++) {
            System.out.println("This is one Card");
            System.out.println(deck.ShowCards().get(x).getValue());
            System.out.println(deck.ShowCards().get(x).getColor());

        }
    }
    @Test
    public  void mixCard(){
        
    }
}
