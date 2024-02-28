import util.TriviaGame;
import model.Question;
import model.User;


public class Main {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("What is the capital of France?",
                        new String[]{"Berlin", "London", "Paris", "Rome"},
                        2),
                new Question("What number is next in the series?  10-9-14-13-18-17-22",
                        new String[]{"21", "24", "27"},
                        0),
                new Question("How many planets are there in our solar system?",
                        new String[]{"7", "8", "9", "10"},
                        1),
                new Question("What number is next in the series?  2-12-6-16-8-18-9",
                        new String[]{"17", "18", "19"},
                        2),
                new Question("Find the relationship between the first two words, then choose the correct option that completes this analogy: Bicycle is to handlebar as car is to _________.",
                        new String[]{"Steering wheel", "License", "Garage", "Handle"},
                        0),

                // Add more questions


        };

        User user = new User();
        TriviaGame game = new TriviaGame(questions);
        game.play();
    }
}
