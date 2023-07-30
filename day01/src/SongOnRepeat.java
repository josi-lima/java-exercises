import java.util.Scanner;

public class SongOnRepeat {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      boolean isOnRepeat = true;

      while(isOnRepeat) {
        System.out.println("Playing current song!");
        System.out.println("Would you like to take this song off of repeat? If so, answer 'yes'.");

        String userInput = input.next();

        if("yes".equals(userInput)) {
          isOnRepeat = false;
        }
      }
    }
    System.out.println("Playing next song!");
  }
}
