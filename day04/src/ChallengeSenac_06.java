public class ChallengeSenac_06 {

  /* 🚀 6. Implemente um programa em Java que calcule a soma dos números
  naturais pares, a partir de um número de início e fim, informados pela
  pessoa usuária. */

  public static int sumEvenNumbers(int startNum, int finalNum) {

    int sum = 0;
    
    for (int index = startNum; index <= finalNum; index += 2) {
      sum += index;
    }
    return sum;
  }

  public static void main(String[] args) {
    int result = sumEvenNumbers(2, 8);
    System.out.println("The sum of the given even numbers is: " + result + ".");
  }
}
