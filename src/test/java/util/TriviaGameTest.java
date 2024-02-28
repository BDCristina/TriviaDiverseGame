package util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.Question;

public class TriviaGameTest {

    @Test
    public void testInitialScoreIsZero() {
        Question[] questions = { new Question("What number is next in the series?  10-9-14-13-18-17-22",
                new String[]{"21", "24", "27"},
                0),
                new Question("What number is next in the series?  2-12-6-16-8-18-9",
                        new String[]{"17", "18", "19"},
                        2),};
        TriviaGame triviaGame = new TriviaGame(questions);
        assertEquals(0, triviaGame.getScore());
    }

    @Test
    public void testScoreIncreasesOnCorrectAnswer() {
        Question[] questions = { new Question("Question", new String[]{"Correct Answer", "Wrong Answer"}, 0) };
        TriviaGame triviaGame = new TriviaGame(questions);
        triviaGame.answerQuestion(1); // Simulează răspunsul utilizatorului la întrebare
        assertEquals(1, triviaGame.getScore()); // Verifică dacă scorul a crescut după răspunsul corect
    }

    @Test
    public void testScoreDoesNotIncreaseOnWrongAnswer() {
        Question[] questions = { new Question("Question", new String[]{"Correct Answer", "Wrong Answer"}, 0) };
        TriviaGame triviaGame = new TriviaGame(questions);
        triviaGame.answerQuestion(2); // Simulează răspunsul utilizatorului la întrebare
        assertEquals(0, triviaGame.getScore()); // Verifică dacă scorul rămâne la zero după un răspuns greșit
    }


}
