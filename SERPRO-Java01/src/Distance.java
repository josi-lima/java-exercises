// A fim de calcular a distância entre pontos de um sistema de computação gráfica, escreva as implementações dos construtores e métodos da classe Distance.

public class Distance {
  
  // ====== non-static attributes ======
  private int x;
  private int y;
  
  // ========= constructors =========
  public Distance () {
    // this = to access attributes, it assigns the parameters to the attributes
    this.x = 0;
    this.y = 0;
  }
  
  public Distance (int x, int y) {
    this.x = x;
    this.y = y;
  }

  // ========== methods ============
  
  // first class method to verify similarity
  public boolean checkSimilarity1(int x, int y) {
    if (this.x == x && this.y == y) {
      return true;
    } else { return false; }
  }

  // second class method to verify similarity
  public boolean checkSimilarity2(Distance point) {
    if (this.x == point.x && this.y == point.y) {
      return true;
    } else { return false; }
  }

  // class method to verify distance between points
  public static void main(String[] args)	{

    int x1,x2,y1,y2;
	  double distance;
	  
    x1 = 1; y1 = 1; x2 = 4; y2 = 4;
	  distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	   
    
    System.out.println("Distance between " + "("+x1+","+y1+"),"+"("+x2+","+y2+") ===> " + distance);
	}   
}

// ======================================================================
