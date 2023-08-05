public class Main {

  public static void main(String[] args) {
      TriangleApp triangleA = new TriangleApp(15, 8, 15,
              8, 17);
      TriangleApp triangleB = new TriangleApp(3, 2.598,
              3, 3, 3);

      double areaTriangleA = triangleA.findArea();
      System.out.println(areaTriangleA);

      double areaTriangleB = triangleB.findArea();
      System.out.println(areaTriangleB);
  }
}