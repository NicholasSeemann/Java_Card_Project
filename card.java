public class Card{
    private String question;
    private String answer;

    public Card(){
        question = "Question goes here.";
        answer = "Answer goes here";
    }

    public Card(String givenAnswer, String givenQuestion){
        question = givenQuestion;
        answer = givenAnswer;
    }

    public String printQuestion(){
        return question;
    }

    public String printAnswer(){
        return answer;
    }

    public boolean answerCheck(String userAnswer){
        boolean result = false;
        String userAnswerCleaned = userAnswer.trim().toLowerCase();
        
        if (userAnswerCleaned.equals(answer)){
            result = true;
        }

        return result;
    }
}