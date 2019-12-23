public class Card {
    private static String value;
    private static String color;

    public Card(String cardValue, String cardColor) {
        this.value = cardValue;
        this.color = cardColor;
    }

    public void setValue(String value) {
        Card.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setColor(String color) {
        Card.color = color;
    }

    public String getColor() {
        return color;
    }

}
