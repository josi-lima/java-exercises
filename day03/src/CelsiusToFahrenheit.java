public class CelsiusToFahrenheit {

  // 🌱 8. Create a function that will convert from Celsius to Fahrenheit.
  // Reminder: C = F – 32 / 1.8

  public static double checkCelsiusToFahrenheit(double degreeCelsius) {
    return degreeCelsius * 1.8 + 32;
  }
  
  public static void main(String[] args) {
    double degreeFahrenheit = checkCelsiusToFahrenheit(20);
    System.out.println(degreeFahrenheit);
  }
}
