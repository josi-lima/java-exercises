public class Exercise04 {

  // 🚀 4. Write a program to calculate the area of a rectangle given its length and width.

  public static double CalculareArea(double length, double width) {

    double area = length * width;
    return area;
  }

  public static void main(String[] args) {
    
    double rectArea = CalculareArea(5.5, 7.0);
    System.out.println(rectArea);
  }  
}

// The formula for the area, 'A' of a rectangle whose length and width are 'l' and 'w' respectively is the product of length and width, that is, "A = l × w".
