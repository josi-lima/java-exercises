import java.util.ArrayList;

public class Colors {

  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();

    lista.add("VERDE");
    lista.add("AZUL"); 
    lista.add("VERMELHO"); 
    lista.add("AMARELO"); 
    lista.add("CINZA"); 

    lista.remove("VERMELHO");
    System.out.println("Lista após exclusão " + lista);
    // Lista após exclusão [VERDE, AZUL, AMARELO, CINZA]

    lista.sort((a, b) -> a.compareTo(b));

    System.out.println("Lista após ordenação " + lista);
    // Lista após ordenação [AMARELO, AZUL, CINZA, VERDE]

    alterar(lista, 2, "BRANCO");
    
    System.out.println("Lista após alteração " + lista);
    // Lista após alteração [AMARELO, AZUL, BRANCO, VERDE]
  }  

  public static void alterar(ArrayList<String> lista, int indice, String cor) {
    lista.set(indice, cor);
  }
}
