package ch.bbw.zork;

public class Question {

    private String questionText;  // Der Text der Frage
    private String correctAnswer;  // Die korrekte Antwort

    // Konstruktor
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    // Gibt den Fragetext zurück
    public String getQuestionText() {
        return questionText;
    }

    // Gibt die korrekte Antwort zurück
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
