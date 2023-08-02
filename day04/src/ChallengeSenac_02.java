import java.util.Scanner;

public class ChallengeSenac_02 {

/* 🚀 2. Implemente um programa em Java que escreva o nome do mês por extenso 
a partir do número do mês, sabendo que o mês de Janeiro é o mês número 01. 
Se o número do mês não estiver entre 1 e 12, deve ser enviada a mensagem: “Mês inválido". 
*/

public static void main(String[] args) {

  Scanner userInput = new Scanner(System.in);

  System.out.println("Please, enter a number from 1 to 12, with no zeros.");
  String month = userInput.next();

  switch (month) {
    case "1":
      System.out.println("January");
      break;
    case "2":
      System.out.println("February");
      break;
    case "3":
      System.out.println("March");
      break;
    case "4":
      System.out.println("April");
      break;
    case "5":
      System.out.println("May");
      break;
    case "6":
      System.out.println("June");
      break;
    case "7":
      System.out.println("July");
      break;
    case "8":
      System.out.println("August");
      break;
    case "9":
      System.out.println("September");
      break;
    case "10":
      System.out.println("October");
      break;
    case "11":
      System.out.println("November");
      break;
    case "12":
      System.out.println("December");
      break;
    default:
      System.out.println("Invalid month.");
  }

  userInput.close();
}
  
}
