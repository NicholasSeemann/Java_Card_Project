import java.util.Scanner;
public class Card{
    private String question;
    private String answer;

    public Card(){
        question = "Question goes here.";
        answer = "Answer goes here";
    }

    public Card(String givenQuestion, String givenAnswer){
        question = givenQuestion;
        answer = givenAnswer;
    }
}