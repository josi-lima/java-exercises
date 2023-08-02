public class FahrenheitToCelsius {

  // 🌱 9. Create a function that will convert degrees from Fahrenheit to Celsius.
  // Reminder: C = F – 32 / 1.8
  
  public static double changeFahrenheitToCelsius(double degreeFahrenheit) {
    return degreeFahrenheit / 1.8 - 32;
  }
    
  public static void main(String[] args) {
    double degreeCelsius = changeFahrenheitToCelsius(110);
    System.out.println("Temperature in Celsius: " + degreeCelsius + " degrees.");
  }
}
  
  

