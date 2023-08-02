public class ChallengeSenac_01 {

    /* 🚀 1. Implemente um programa em Java que informe a situação de um 
    orçamento familiar baseado no total de ganhos e gastos. 
    Se o total de ganhos for maior ou igual ao total de gastos, deve ser 
    exibida a mensagem: "Você está dentro do orçamento!", senão "Você 
    está fora do orçamento! Não gaste mais!"
    */

    public static void checkBudget (double earnings, double expenses) {

        if (earnings >= expenses) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Você está fora do orçamento! Não gaste mais!");
        }
    }
    public static void main(String[] args) {
        checkBudget(5240, 7500);        
    }
}
