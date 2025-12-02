public class thirdEquationofMotion {

  public static void main(String[] args) {
    // Sample values
    double v = 10; // final velocity
    double u = 5; // initial velocity
    double a = 2; // acceleration
    double s = 4; // displacement

    // Expression: (v^2 - u^2) / (2 * a * s)
    double result = ((v * v) - (u * u)) / (2 * a * s);
    /*
		(v * v) = v²

		(u * u) = u²

		(v*v - u*u) → numerator

		(2 * a * s) → denominator
*/
    System.out.println("Result = " + result);
  }
}
