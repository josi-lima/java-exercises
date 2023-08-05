public class TriangleApp {
    // static instance variable or attribute
    static int numOfSides = 3;
    
    // non-static instance variables or attributes
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructor
    public TriangleApp(double base, double height, double
                    sideLenOne, double sideLenTwo, double sideLenThree) {

        // this = to access attributes, it assigns the parameters to the attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

        // class method
        public double findArea() {
            return (this.base * this.height) / 2;
        }
}