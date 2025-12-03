package ch.bbw.zork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionPool {
    private List<Question> allQuestions;  // Alle verfügbaren Fragen
    private List<Question> availableQuestions;  // Fragen die noch nicht gestellt wurden
    private Random random;  // Für zufällige Auswahl

    // Konstruktor
    public QuestionPool() {
        this.allQuestions = new ArrayList<>();
        this.availableQuestions = new ArrayList<>();
        this.random = new Random();
        initializeQuestions();
        resetPool();
    }

    // Initialisiert alle 10 Fragen
    private void initializeQuestions() {
        allQuestions.add(new Question("What is 5 + 7?", "12"));
        allQuestions.add(new Question("What is 2 + 8", "10"));
        allQuestions.add(new Question("How many days are in a week?", "7"));
        allQuestions.add(new Question("What color do you get when you mix blue and yellow?", "green"));
        allQuestions.add(new Question("What is the largest planet in our solar system?", "Jupiter"));
        allQuestions.add(new Question("In which year did World War II end?", "1945"));
        allQuestions.add(new Question("What is the square root of 64?", "8"));
        allQuestions.add(new Question("What programming language are we using?", "Java"));
        allQuestions.add(new Question("How many continents are there?", "7"));
        allQuestions.add(new Question("What is the boiling point of water in Celsius?", "100"));
    }

    // Gibt eine zufällige Frage zurück und entfernt sie aus der Liste
    public Question getRandomQuestion() {
        if (availableQuestions.isEmpty()) {
            resetPool();
        }

        int randomIndex = random.nextInt(availableQuestions.size());
        Question selectedQuestion = availableQuestions.get(randomIndex);
        availableQuestions.remove(randomIndex);  // Frage entfernen, damit sie nicht nochmal kommt

        return selectedQuestion;
    }

    // Setzt den Pool auf alle Fragen zurück
    public void resetPool() {
        availableQuestions.clear();
        availableQuestions.addAll(allQuestions);
    }

    // Gibt die Anzahl der verbleibenden Fragen zurück
    public int getRemainingQuestions() {
        return availableQuestions.size();
    }
}
