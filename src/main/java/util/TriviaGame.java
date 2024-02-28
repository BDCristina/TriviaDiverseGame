package util;

import java.util.Scanner;
import model.Question;
import model.User;

public class TriviaGame {
    private Question[] questions;
    private int score;
    private User user;

    public TriviaGame(Question[] questions) {
        this.questions = questions;
        this.score = 0;
        this.user = new User();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        user.setName(userName);

        System.out.println("Hello, " + user.getName() + "! Welcome to Trivia Game");

        System.out.println("You will be asked " + questions.length + " questions. Let's get started!");

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String[] answers = question.getAnswers();
            for (int i = 0; i < answers.length; i++) {
                System.out.println((i + 1) + ". " + answers[i]);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            answerQuestion(userAnswer); // Apelăm metoda pentru a procesa răspunsul utilizatorului

            System.out.println();
        }

        System.out.println(user.getName() + ", Game over. Your final score is: " + score);

        // Provide feedback based on the score
        if (score == questions.length) {
            System.out.println("Congratulations! You got all the questions right. You're a trivia master!");
        } else if (score >= questions.length / 2) {
            System.out.println("Well done! You got more than half of the questions right. Keep it up!");
        } else {
            System.out.println("Better luck next time! You can always try again.");
        }
    }

    public void answerQuestion(int userAnswer) {
        Question currentQuestion = questions[score]; // Obținem întrebarea curentă
        if (userAnswer - 1 == currentQuestion.getCorrectAnswerIndex()) {
            System.out.println("Correct answer! You've earned a point.");
            score++;
        } else {
            System.out.println("Wrong answer!");
        }
    }
    public int getScore() {
        return score;
    }

}
