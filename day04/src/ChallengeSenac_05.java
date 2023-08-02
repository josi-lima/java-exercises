import java.util.Scanner;

public class ChallengeSenac_05 {

  /* 🚀 5. Implemente um programa em Java que calcule o fatorial de um número
  informado pelo usuário. */

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please, enter a number to be calculated its factorial.");
    int num = userInput.nextInt();

    int factor = 1;

    for (int index = 1; index <= num; index += 1) {
      factor *= index;
    }

    userInput.close();
    System.out.println("The factorial of " + num + " is: " + factor + ".");
  }
}
