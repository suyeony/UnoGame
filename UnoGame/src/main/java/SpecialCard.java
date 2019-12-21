public class SpecialCard extends Card {
 private static Rule rule;

    public static void setRule(Rule rule) {
        SpecialCard.rule = rule;
    }

    public static Rule getRule() {
        return rule;
    }
}
