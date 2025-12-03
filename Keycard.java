package ch.bbw.zork;

public class Keycard extends Item {
    private int level;  // Zugriffsebene der Keycard

    // Konstruktor mit allen Parametern
    public Keycard(String name, String description, int weight, String effect, int level) {
        super(name, description, weight, effect);  // Ruft Konstruktor der Mutterklasse auf
        this.level = level;
        this.name = name;
        this.weight = weight;
    }

    // Gibt das Level zurück
    public int getLevel() {
        return level;
    }

    // Setzt das Level
    public void setLevel(int level) {
        this.level = level;
    }
}
