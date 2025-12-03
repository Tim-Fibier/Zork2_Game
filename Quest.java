package ch.bbw.zork;

public class Quest {
    private String description;  // Beschreibung der Quest
    private Question question;  // Frage der Quest
    private Keycard reward;  // Belohnung für das Abschließen
    private boolean completed;  // Ob Quest abgeschlossen ist

    // Konstruktor
    public Quest(String description, Question question, Keycard reward) {
        this.description = description;
        this.question = question;
        this.reward = reward;
        this.completed = false;
    }

    // Gibt Beschreibung und Frage zurück
    public String getDescription() {
        return description + "\n\nQuestion: " + question.getQuestionText();
    }

    // Gibt die Frage zurück
    public String getQuestion() {
        return question.getQuestionText();
    }

    // Prüft, ob die Antwort korrekt ist
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(question.getCorrectAnswer());
    }

    // Setzt Quest als abgeschlossen und gibt Belohnung zurück
    public Keycard complete() {
        if (!completed) {
            completed = true;
            return reward;
        }
        return null;
    }

    // Prüft, ob Quest abgeschlossen ist
    public boolean isCompleted() {
        return completed;
    }

    // Gibt die Belohnung zurück
    public Keycard getReward() {
        return reward;
    }
}
