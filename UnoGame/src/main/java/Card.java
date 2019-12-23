public class Card {
    private static String value;
    private static String color;
    
    public Card(String cardValue, String cardColor) {
        this.value = cardValue;
        this.color = cardColor;
    }
    
    public static void setValue(String value) {
        Card.value = value;
    }
    
    public static getValue() {
        return value;
    }
    
    public static void setColor(String color) {
        Card.color = color;
    }
    
    public getColor() {
        return color;
}
    
}
