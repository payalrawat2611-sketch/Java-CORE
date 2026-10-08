import java.util.ArrayList;
import java.util.Scanner;
public class quizApp {

    private String question;
    private String[] options;
    private int correctAnswer;

    public quizApp(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("\n" + question);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}

class Quiz {

    private ArrayList<quizApp> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(quizApp question) {
        questions.add(question);
    }

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("          JAVA QUIZ");
        System.out.println();

        for (quizApp question : questions) {

            question.displayQuestion();

            System.out.print("Enter your answer: ");
        }
    }
}