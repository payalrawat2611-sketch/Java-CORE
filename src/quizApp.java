public class quizApp {

    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
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

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("          JAVA QUIZ");
        System.out.println("================================");

        for (Question question : questions) {

            question.displayQuestion();

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (question.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n================================");
        System.out.println("             RESULT");
        System.out.println("================================");
        System.out.println("Score: " + score + "/" + questions.size());
    }
}
```

        ### `Main.java`

        ```java
public class Main {

    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.addQuestion(
                new Question(
                        "Which keyword is used to inherit a class?",
                        new String[]{"implements", "extends", "inherits", "super"},
                        2
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which collection does not allow duplicate elements?",
                        new String[]{"List", "ArrayList", "Set", "Vector"},
                        3
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which keyword is used to create an object?",
                        new String[]{"class", "new", "object", "create"},
                        2
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which concept allows the same method to behave differently?",
                        new String[]{"Inheritance", "Encapsulation", "Polymorphism", "Abstraction"},
                        3
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which keyword is used to handle an exception?",
                        new String[]{"try", "check", "error", "exception"},
                        1
                )
        );

        quiz.startQuiz();
    }
}
```

        ### Your Part 1 project structure

```text
QuizApplication/
        │
        ├── Question.java
├── Quiz.java
└── Main.java
```

This version gives you a clean first commit.

For **Part 2**, we can add much more: **show correct answers after the quiz, review all questions, score percentage, categories, difficulty levels, random questions, retry option, input validation, timer, and custom exceptions**.
