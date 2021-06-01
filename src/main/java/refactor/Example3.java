package refactor;

/***
 * Extract a method
 * If a method has some functionality that can be isolated, you should place it in a separate method.
 * **/
public class Example3 {
    public static void main(String[] args) {
        new Example3().calcQuadraticEq(1d, 2d, 3d);
    }

    public void calcQuadraticEq(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }
}








/****
 * ***** Hint ****
 * Line 15 to 18 move to method ex. greaterThanZero(...)
 * Line 20 to 22 move to method ex. equalToZero(..)
 * Line 24 can be moved to method ex. lessThanZero()
 * ****/