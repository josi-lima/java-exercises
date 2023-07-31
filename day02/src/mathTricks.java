public class mathTricks {

  public static double checkPow(double a, double b) {
    double exponent = Math.pow(a, b);
    return exponent;   
  }

  public static int checkMax(int a, int b) {
    int max = Math.max(a, b);
    return max;  
  }

  public static int checkMin(int a, int b) {
    int min = Math.min(a, b);
    return min;  
  }

  public static void main(String[] args) {

    double resultA = checkPow(2, 5); 
    System.out.println(resultA); // 32.0

    int resultB = checkMax(13, 504); 
    System.out.println(resultB); // 504

    int resultC = checkMin(302, 4600); 
    System.out.println(resultC); // 302
  }
}