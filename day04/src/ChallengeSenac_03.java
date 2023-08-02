import java.util.Scanner;

public class ChallengeSenac_03 {

  /* 🚀 3. Implemente um programa em Java que a partir da temperatura corporal, avalie a
  situação do(a) paciente. Ao final, apresente a classificação. */

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("Please, enter your body temperature.");

    double temperature = userInput.nextDouble(); 

    if (temperature >= 41) {
      System.out.println("Hyperthermia");
    } else if (temperature >= 39.6) {
      System.out.println("High fever");
    } else if (temperature >= 37.6) {
      System.out.println("Fever");
    } else if (temperature >= 36) {
      System.out.println("Normal");
    } else {
      System.out.println("Hypothermia");
    }

    userInput.close();
  }
}
