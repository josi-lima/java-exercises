public class Exercise03 {

  // 🚀 3. Convert temperature from Celsius to Fahrenheit.
  // Reminder: C = F – 32 / 1.8, which means C * 1.8 + 32

  public static double convertCelsiusToFahr(double degCelsius) {

    double temp = degCelsius * 1.8 + 32; 
    return temp;
  }
  
  public static void main(String[] args) {
    double temperature = convertCelsiusToFahr(23.4);
    System.out.println(temperature);
  }
}
