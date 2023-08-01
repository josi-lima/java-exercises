public class MealPrice {

  public static double calculateMealPrice(int numberOfPeople, double listedPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedPrice / 100;
    double tax = taxRate * listedPrice / 100;
    double result = listedPrice + tip + tax;
    double individualCost = result / numberOfPeople ;
 
    System.out.println("The price of your meal is $" + listedPrice + ".");
    System.out.println("The calculated tip is $" + tip + ".");
    System.out.println("The individual cost for each person is $" + individualCost + ".");
    
    return result;
  }
  
  public static void main(String[] args) {
    double groupTotalMealCost = calculateMealPrice(4, 120, 10, 8);

    System.out.println("The total price of your meal is $" + groupTotalMealCost + ".");
  }
}
