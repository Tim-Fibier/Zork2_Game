package ch.bbw.zork;

public class Backpack extends Item {
    private int capacity;  // Zusätzliche Tragkapazität
    private boolean isEquipped;  // Wird getragen oder nicht

    // Konstruktor mit allen Parametern
    public Backpack(String name, String description, int weight, String effect, int capacity) {
        super(name, description, weight, effect);
        this.capacity = capacity;
        this.isEquipped = false;
    }

    // Standard-Rucksack mit Standardwerten
    public Backpack() {
        super("Backpack", "A sturdy backpack that increases your carrying capacity", 2, "increase_capacity");
        this.capacity = 10;
        this.isEquipped = false;
    }

    // Gibt die Kapazität zurück
    public int getCapacity() {
        return capacity;
    }

    // Prüft, ob Rucksack getragen wird
    public boolean isEquipped() {
        return isEquipped;
    }

    // Setzt den Equip-Status
    public void setEquipped(boolean equipped) {
        this.isEquipped = equipped;
    }
}
