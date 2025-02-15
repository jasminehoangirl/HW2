public class Main {

    public static void main(String[] args) {

        QuestionList questionList = new QuestionList();
        AnswerList answerList = new AnswerList();

        Question question1 = new Question(1, "How do I add a question?", "Jerry", "Open");
        questionList.addQuestion(question1);
        questionList.DisplayQuestions();

        User teacher = new User(1, "Teacher"); 
        Answer answer1 = new Answer(1, "You just did it.", teacher, 1); 
        answerList.addAnswer(answer1);

        answerList.viewAnswers(1);

        questionList.updateQuestion(1, "How do I add a question again?");
        questionList.DisplayQuestions();
        
        
        answerList.updateAnswer(1, "You just did it again.");
        answerList.viewAnswers(1);

        questionList.removeQuestion(1);
        answerList.removeAnswer(1);

        questionList.DisplayQuestions();
        answerList.viewAnswers(1); 
    }

}