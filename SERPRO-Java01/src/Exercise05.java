import java.util.Scanner;

public class Exercise05 {

  // 🚀 5. Create a program that takes a user's name and age as input and prints a greeting message.

  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);

    System.out.println("What's your first name? ");
    String name = userInput.next();

    System.out.println("How old are you? ");
    String age = userInput.next();
    
    userInput.close();
    
    System.out.println("Welcome, " + name + " ! Today's your birthday! You're turning " + age + " . ");
  }
}
