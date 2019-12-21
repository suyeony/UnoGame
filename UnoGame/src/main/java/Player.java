public class Player {
    private static String name;
    private static Deck deck;
    private static boolean turn;

    Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setTurn(boolean turn){
        this.turn = turn;
    }
    public boolean getTurn(){
        return turn;
    }
}
