public class SpecialCard extends Card {
 private static Actions actions;

    public static void setActions(Actions actions) {
        SpecialCard.actions = actions;
    }

    public static Actions getActions() {
        return actions;
    }
}
