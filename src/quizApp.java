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

    public String getCorrectAnswer() {
        return options[correctAnswer - 1];
    }

    public String getQuestion() {
        return question;
    }

    public String getOption(int answer) {
        return options[answer - 1];
    }
}