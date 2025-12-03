package ch.bbw.zork;

public class Item {
    String name;  // Name des Items
    private String description;  // Beschreibung des Items
    int weight;  // Gewicht des Items
    private String effect;  // Spezialeffekt (z.B. "flashlight", "hint", "tool")

    // Konstruktor zum Erstellen eines Items
    public Item(String name, String description, int weight, String effect) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.effect = effect;
    }

    // Gibt den Namen zurück
    public String getName() {
        return name;
    }

    // Gibt die Beschreibung zurück
    public String getDescription() {
        return description;
    }

    // Gibt das Gewicht zurück
    public int getWeight() {
        return weight;
    }

    // Gibt den Effekt zurück
    public String getEffect() {
        return effect;
    }
}
