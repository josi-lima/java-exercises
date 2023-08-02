public class CelsiusToFahrenheit {

  // 🌱 8. Create a function that will convert degrees from Celsius to Fahrenheit.
  // Reminder: C = F – 32 / 1.8

  public static double changeCelsiusToFahrenheit(double degreeCelsius) {
    return degreeCelsius * 1.8 + 32;
  }
  
  public static void main(String[] args) {
    double degreeFahrenheit = changeCelsiusToFahrenheit(20);
    System.out.println("Temperature in Fahrenheit: " + degreeFahrenheit + " degrees.");
  }
}
