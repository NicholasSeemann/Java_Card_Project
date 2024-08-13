import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Card> masterList = new ArrayList<Card>();
        Integer numCards = 0;

        Card firstCard = new Card("error-checking code", "___________________is code a programmer writes to detect and handle errors that occur during program execution");
        masterList.add(firstCard);
        Card secondCard = new Card("&&", "Which logical operator evaluates true when both of its two operands are true?");
        masterList.add(secondCard);
        Card thirdCard = new Card("try", "A _____ block surrounds normal code, which is exited immediately if a throw statement executes.");
        masterList.add(thirdCard);
        Card fourthCard = new Card("finally block", "A __________  __________ follows all catch blocks, and executes after the program exits the corresponding try or catch blocks");
        masterList.add(fourthCard);
        Card fifthCard = new Card("ioexception", "What type of exception may be thrown by a FileWriter's constructor?");
        masterList.add(fifthCard);
        Card sixthCard = new Card("encapsulation", "Lower-level internal details hidden from the users is known as ________________.");
        masterList.add(sixthCard);
        Card seventhCard = new Card("private", "In addition to public member methods, a class definition has _________ fields: Variables that member methods can access but class users cannot. ");
        masterList.add(seventhCard);
        Card eighthCard = new Card("object", "In programming, an ____________ is a grouping of data (variables) and operations that can be performed on that data (methods).");
        masterList.add(eighthCard);
        Card ninthCard = new Card("abstract data type", "A(n) ________________________ is a data type whose creation and update are constrained to specific well-defined operations.");
        masterList.add(ninthCard);
        Card tenthCard = new Card("method call", "A ________ ______ is an invocation of a method's name, causing the method's statements to execute.");
        masterList.add(tenthCard);
        Card eleventhCard = new Card("parameter", "A _________ is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.");
        masterList.add(eleventhCard);
        Card twelfthCard = new Card("element", "Each item in an array is known as an ________________.");
        masterList.add(twelfthCard);
        Card thirteenthCard = new Card("index", "In an array, each element's location number is called the _____________.");
        masterList.add(thirteenthCard);
        Card fourteenth = new Card("while", "A __________ loop is a program construct that repeatedly executes a list of sub-statements (known as the loop body) while the loop's expression evaluates to true.");
        masterList.add(fourteenth);
        Card fifteenthCard = new Card("iteration", "Each execution of the loop body is called an _________________.");
        masterList.add(fifteenthCard);
        Card sixteenthCard = new Card("<", "Which logical operator triggers an if statement if the first variable is less than the second variable?");
        masterList.add(sixteenthCard);
        Card seventeenthCard = new Card("branch", "A(n) _____________ is a program path taken only if an expression's value is true.");
        masterList.add(seventeenthCard);
        Card eighteenthCard = new Card("final", "This keyword is used to define a constant variable.");
        masterList.add(eighteenthCard);
        Card nineteenthCard = new Card("||", "Which logical operator evaluates true when at least one of its two operands are true?");
        masterList.add(nineteenthCard);
        Card twentyCard = new Card("incrementing", "Increasing a variable's value by 1, as in x = x + 1, is common and known as _______________the variable.");
        masterList.add(twentyCard);
        Card twentyOneCard = new Card("algorithm", "A sequence of instructions that solves a problem is called a(n) _____ .");
        masterList.add(twentyOneCard);
        Card twentyTwoCard = new Card("memory", "In what component does a processor store the processor's required instructions and data?");
        masterList.add(twentyTwoCard);
        Card twentyThreeCard = new Card("variables", "In an instruction like: z = x + y, the symbols x, y, and z are examples of _____.");
        masterList.add(twentyThreeCard);
        Card twentyFourCard = new Card("exception", "An ___________ is a circumstance that a program was not designed to handle, such as if the user enters a negative height.");
        masterList.add(twentyFourCard);
        Card twentyFiveCard = new Card("exception-handling constructs", "The language has special constructs, try, throw, and catch, known as__________________, to keep error-checking code separate and to reduce redundant checks.");
        masterList.add(twentyFiveCard);
        Card twentySixCard = new Card("throw", "A __________ statement appears within a try block; if reached, execution jumps immediately to the end of the try block.");
        masterList.add(twentySixCard);
        Card twentySevenCard = new Card("catch", "A ____________ clause immediately follows a try block; if the catch was reached due to an exception thrown of the catch clause's parameter type, the clause executes.");
        masterList.add(twentySevenCard);
        Card twentyEightCard = new Card("class", "The _________ construct defines a new type that can group data and methods to form an object.");
        masterList.add(twentyEightCard);
        Card twentyNineCard = new Card("data encapsulation", "Mandy designs a Student object that includes a name, address and gpa. This is an example of ___.");
        masterList.add(twentyNineCard);
        Card thirtyCard = new Card("abstraction", "___ means to have a user interact with an item at a high-level.");
        masterList.add(thirtyCard);
        Card thirtyOneCard = new Card("method", "A _________ is a named list of statements.");
        masterList.add(thirtyOneCard);
        Card thirtyTwoCard = new Card("!", "Which logical operator will trigger an if statement if the conditions are false?");
        masterList.add(thirtyTwoCard);
        Card thirtyThreeCard = new Card(">", "Which logical operator will trigger an if statement if the first variable is greater than the second variable?");
        masterList.add(thirtyThreeCard);
        Card thirtyFourCard = new Card("return", "A method may return one value using a _______ statement");
        masterList.add(thirtyFourCard);
        Card thirtyFiveCard = new Card("array", "A(n) __________ is a special variable having one name, but storing a list of data items, with each item being directly accessible.");
        masterList.add(thirtyFiveCard);
        Card thirtySixCard = new Card("==", "Which logical operator will evaluate true when a variable is equal to another?");
        masterList.add(thirtySixCard);
        Card thirtySevenCard = new Card("500", "If the array's last index was 499, how many elements does the array have?");
        masterList.add(thirtySevenCard);
        Card thirtyEightCard = new Card("loop", "A _________ is a program construct that repeatedly executes.");
        masterList.add(thirtyEightCard);
        Card thirtyNineCard = new Card("infinite", "An ________ loop is a loop that never stops iterating.");
        masterList.add(thirtyNineCard);
        Card fortyCard = new Card("for", "A _________ loop is a loop with three parts at the top: a loop variable initialization, a loop expression, and a loop variable update.");
        masterList.add(fortyCard);
        Card fortyOneCard = new Card("!=", "Which logical operator evaluates true when the variables it is evaluating are not equal?");
        masterList.add(fortyOneCard);
        Card fortyTwoCard = new Card("if", "An ____ statement executes a group of statements if an expression is true");
        masterList.add(fortyTwoCard);
        Card fortyThreeCard = new Card("braces", "_________, sometimes redundantly called curly braces, represent a grouping, such as a grouping of statements.");
        masterList.add(fortyThreeCard);
        Card fortyFourCard = new Card("if-else", "An ________ statement executes one group of statements when an expression is true, and another group of statements when the expression is false.");
        masterList.add(fortyFourCard);
        Card fortyFiveCard = new Card("statement", "An __________________ assigns a variable with a value, such as x = 5.");
        masterList.add(fortyFiveCard);
        Card fortySixCard = new Card("case sensitive", "Java is _______________ _______________, meaning upper- and lowercase letters differ. Ex: 'Cat' and 'cat' are different.");
        masterList.add(fortySixCard);
        Card fortySevenCard = new Card("comment", "A __________ is text a programmer adds to code, to be read by humans to better understand the code but ignored by the compiler.");
        masterList.add(fortySevenCard);
        Card fortyEigthCard = new Card("20", "Consider the instruction: z = x + y. If x is 5 and y is 15, then z is assigned with _____.");
        masterList.add(fortyEigthCard);
        Card fortyNineCard = new Card("program", "A __________ starts in main(), executing the statements within main's braces { }, one at a time.");
        masterList.add(fortyNineCard);
        Card fiftyCard = new Card(";", "Each statement typically appears alone on a line and ends with a ___________, as English sentences end with a period.");
        masterList.add(fiftyCard);

        System.out.println("Please type the number of cards you want in your list (must be between 1-50, inclusive)");
        while(true){
            try{
                numCards = scnr.nextInt();
                if((numCards > 0) && (numCards <= 50)){
                    break;
                }
                else{
                    System.out.println("The number you've entered is out of the allowed range, please type a number which is between 1-50");
                }
            }
            catch (InputMismatchException exception){
                System.out.println("What you've entered is not a valid input, please type a number between 1-50");
                scnr.next();
            }
        }
        System.out.println("");
        System.out.println("Generating your list of flashcards...");
        ArrayList<Card> userList = new ArrayList<Card>();
        ArrayList<Integer> usedInts = new ArrayList<Integer>();
        usedInts.add(-1);

        for(int i = 1; i <= numCards; i++){
            int randInt;
            boolean isDuplicate;
            do {
                randInt = rand.nextInt(50);
                isDuplicate = usedInts.contains(randInt);
            } while (isDuplicate);
            userList.add(masterList.get(randInt));
            usedInts.add(randInt);
        }

        System.out.println("Your cards are ready, we will send a description of the term to you and you are to type the asnwer in response");
        System.out.println("You may enter 'q' if you would like to quit at anytime. Remember, it must be lowercase!");
        System.out.println("");

        Integer score = 0;
        Integer scoreStreak = 0;
        scnr.nextLine();
        for(int i = 0; i < userList.size(); i++){
            if(scoreStreak == 3){
                System.out.println("Nice! You got three correct answers in a row!");
            }
            else if(scoreStreak == 10){
                System.out.println("Impressive, you got ten correct answers in a row!");
            }
            else if(scoreStreak == 25){
                System.out.println("25 correct answers in a row...are you cheating? -_-");
            }

            (userList.get(i)).printQuestion();
            String userAnswer = scnr.nextLine();

            if(userAnswer.equals("q")){
                break;
            }

            if ((userList.get(i)).answerCheck(userAnswer)){
                System.out.println("Congratulations! You got the right answer.");
                System.out.println("");
                scoreStreak += 1;
                score += 1;
            }
            else{
                System.out.print("Sorry! The answer was ");
                (userList.get(i)).printAnswer();
                System.out.print(", you'll get it next time!");
                scoreStreak = 0;
                System.out.println("");
            }
        }
        System.out.println("Your final score was " + score + "/" + userList.size());
        
        if((score == userList.size()) && (userList.size() == 50)){
            System.out.println("Wow, you answered every single card correctly! You're ready for the final test!");
        }
    }
}