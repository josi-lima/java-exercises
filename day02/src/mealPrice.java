public class mealPrice {

  public static void calculateMealPrice(double listedPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedPrice / 100;
    double tax = taxRate * listedPrice / 100;
    double result = listedPrice + tip + tax;
    System.out.println("The price of your meal is $ " + listedPrice + ".");
    System.out.println("The calculated tip is $ " + tip + ".");
    System.out.println("The total price of your meal is $ " + result + ".");
  }
  
  public static void main(String[] args) {
    calculateMealPrice(120, 10, 8);
  }
}
