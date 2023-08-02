public class ChallengeSenac_04 {

  /* 🚀 4. Implemente um programa em Java que informe qual a situação de uma 
  pessoa candidata de vestibular a partir da nota que ela tirou, da nota de 
  corte e da nota mínima para aprovação.  

  a) Se a nota for menor que a nota de corte = "Candidato não passou".
  b) Se a nota for maior ou igual a nota de aprovação = "Candidato aprovado".
  c) Se a nota estiver entre a nota de corte e a nota mínima de aprovação =
    "Candidato está na lista de espera".
  */

  public static void checkApproved (double grade, double cutOffGrade, double minimumGrade) {

    if (grade < cutOffGrade) {
      System.out.println("You've not been approved!");
    } else if (grade >= minimumGrade) {
      System.out.println("Congratulations!! You're approved!");
    } else if (grade >= cutOffGrade && grade < minimumGrade) {
      System.out.println("You've been placed on the waiting list!");
    }
  }
  public static void main(String[] args) {
    checkApproved (89, 70, 75);
  }
}
