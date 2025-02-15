// QuestionList

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
    private List<Question> questions;
    
    public QuestionList() {
        this.questions = new ArrayList<>();
    }

// Create Question

public void addQuestion(Question question) {
    questions.add(question);
    System.out.println("Question has been added.");
}

// Read Question

public void DisplayQuestions() {
    if (questions.isEmpty()) {
        System.out.println("No Questions Found.");
    } else {
        for (Question question : questions) {
            System.out.println("ID: " + question.getId() + ", Text: " + question.getText() + ", Status: " + question.getStatus());
        }
    }
}

// Update Question

public void updateQuestion(int id, String newText) {
    for (Question question : questions) {
        if (question.getId() == id) {
            question.editQuestion(newText);
            return;
        }
    }
    return;
}

// Delete Question
public void removeQuestion(int id) {
    for (int i = 0; i < questions.size(); i++) {
        Question question = questions.get(i);
        if (question.getId() == id) {
            question.deleteQuestion();
            questions.remove(i);
            return;
        }
    }
    return;
}
}




// AnswerList
public class AnswerList {
    private List<Answer> answers;

    public AnswerList() {
        this.answers = new ArrayList<>();
    }

// Create a new answer
public void addAnswer(Answer answer) {
    answers.add(answer);
    System.out.println("Answer has been added.");
}

// Read Answers
public void viewAnswers(int questionId) {
    boolean found = false;
    for (Answer answer : answers) {
        if (answer.getId() == questionId) {
            System.out.print("Answer ID: " + answer.getId() + ", Answer: " + answer.getAnswerText());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No answers found.");
    }
}

// Update an Answer
public void updateAnswer(int id, String newText) {
    for (Answer answer : answers) {
        if (answer.getId() == id) {
            answer.editAnswer(newText);
            return;
        }
    }
    return;
}

// Delete Answer
public void removeAnswer(int id) {
    for (Answer answer : answers) {
        if (answer.getId() == id) {
            answer.deleteAnswer();
            answers.remove(answer);
            return;
        }
    }
    System.out.println("Answer not Found");
}

}