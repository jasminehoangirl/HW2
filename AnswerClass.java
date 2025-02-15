// Creating the Answer Class

public class Answer {
    private int id;
    private String answerText;
    private String author;

public Answer(int id, String answerText, String author) {
    this.id = id;
    this.answerText = answerText;
    this.author = author;
}
public int getId() {
    return id;
}

public void setID(int id) {
    this.id = id;
}

public String getAnswerText() {
    return answerText;
}
public void setAnswerText(String answerText) {
    this.answerText = answerText;
}

public User getAuthor() {
    return author;
}

public void setAuthor(User author) {
    this.author = author;
}

// editAnswer
public void editAnswer(String newText) {
    this.answerText = newText;
    System.out.println("Answer updated successfully.");
}

public void deleteAnswer() {
    System.out.println("Answer has been deleted.");
}
}