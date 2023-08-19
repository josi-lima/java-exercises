public class Exercise06 {

  // 🚀 6. Write a program to check if a number is even or odd.

  public static String CheckEvenOrOdd(int num) {
    if (num % 2 == 0) { return "even"; } 
    else { return "odd"; }
  }

  public static void main(String[] args) {
    String result = CheckEvenOrOdd(17);
    System.out.println(result);
  }
}
