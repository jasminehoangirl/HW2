import java.util.List;

// Creating the Question Class

public class Question {
    private int id;
    private String text;
    private User author;
    private String status; 

public Question (int id, String text, User author, String status) {
    this.id = id;
    this.text = text;
    this.author = author;
    this.status = status;
}

public int getId() {
    return id;
}

public void setID(int id) {
    this.id = id;
}

public String getText() {
    return text;
}

public User getAuthor() {
    return author;
}

public void setAuthor(User author) {
    this.author = author;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

// Method to Edit Question
public void editQuestion(String newText) {
    this.text = newText; // updates the text of the question
    System.out.println("Question has been updated.");
}

// Method to Delete Question
public void deleteQuestion() {
    this.text = null; // deletes text
    this.status = "Deleted";
    System.out.println("Question has been deleted.");
}

// Method to Mark Question as Solved
public void markSolved() {
this.status = "closed"; // marks the question as closed
System.out.println("Question has been marked as solved.");
}
}