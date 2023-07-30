import java.util.Scanner;

public class HistoryQuiz {
  public static void main(String[] args) {
    try (Scanner userInput = new Scanner(System.in)) {
    
      String question = "How long did the right-wing dictatorship in Brazil last for?";
      String instruction = "Please, type only the letter of the correct option.";

      // Write a print statement asking the question
      System.out.println(question);
      
      // Write a print statement giving the answer choices
      System.out.println("a) 4 years");
      System.out.println("b) 15 years");
      System.out.println("c) 21 years");

      System.out.println(instruction);
      
      // Have the user input an answer
      String answer = userInput.next();

      // then depending on the answer of the user print out a message
      if ("c".equals(answer)) {
        System.out.println("Correct! You're a history pro! It was a long period indeed.");
      } 
      else if ("a".equals(answer) || "b".equals(answer)) {
        System.out.println("Incorrect! The correct answer is C. Keep working on history facts!");
      } else {
        System.out.println("Please, enter a valid answer next time.");
      }
    }
  }  
}
