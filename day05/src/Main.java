public class Main {

  public static void main(String[] args) {

      // non-static instance methods
      TriangleApp triangleA = new TriangleApp(15, 8, 15,
              8, 17);
      TriangleApp triangleB = new TriangleApp(3, 2.598,
              3, 3, 3);

      // static instance variable or attribute
      System.out.println("Number of sides in a triangle: " + TriangleApp.numOfSides);
      
      double areaTriangleA = triangleA.findArea();
      // access the behavior of a specific triangle instance
      System.out.println("Area of triangle A: " + areaTriangleA);

      // access attributes with the dot operator
      // base = non-static instance variable
      System.out.println("Base of triangle A: " + triangleA.base);

      double areaTriangleB = triangleB.findArea();
      System.out.println("Area of triangle B: " + areaTriangleB);

      // height = non-static instance variable
      System.out.println("Height of triangle B: " + triangleB.height);

  }
}