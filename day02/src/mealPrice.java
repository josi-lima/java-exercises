public class mealPrice {

  public static double calculateMealPrice(double listedPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedPrice / 100;
    double tax = taxRate * listedPrice / 100;
    double result = listedPrice + tip + tax;

    System.out.println("The price of your meal is $" + listedPrice + ".");
    System.out.println("The calculated tip is $" + tip + ".");
    
    return result;
  }
  
  public static void main(String[] args) {
    double groupTotalMealCost = calculateMealPrice(120, 10, 8);
    double individualCost = groupTotalMealCost / 5;

    System.out.println("The total price of your meal is $" + groupTotalMealCost + ".");
    System.out.println("The individual cost for each person is $" + individualCost + ".");
  }
}
