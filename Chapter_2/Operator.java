public class Operator {

  public static void main(String[] args) {
    int a = 12;
    int b = 5;
    //  ==========================================================================
    System.out.println("=== Basic Arithmetic Operations ===");
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
    System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    System.out.println("Division: " + a + " / " + b + " = " + (a / b));
    System.out.println(
      "Modulo (Reminder) : " + a + " % " + b + " = " + (a % b)
    );
    System.out.println();
    //  ==========================================================================
    // Integer division vs floating-point division
    System.out.println("Integer vs Floating-Point Division:");
    int intResult = 7 / 2;
    double doubleResult = 7.0 / 2.0;
    System.out.println("Integer division (7 / 2): " + intResult);
    System.out.println("Floating-point division (7.0 / 2.0): " + doubleResult);
    System.out.println();
    //  ==========================================================================
    // Assignment operators
    System.out.println("=== Assignment Operators ===");
    int num = 10;
    System.out.println("Original value: num = " + num);

    num += 5; // Same as num = num + 5
    System.out.println("After num += 5: " + num);

    num -= 3; // Same as num = num - 3
    System.out.println("After num -= 3: " + num);

    num *= 2; // Same as num = num * 2
    System.out.println("After num *= 2: " + num);

    num /= 4; // Same as num = num / 4
    System.out.println("After num /= 4: " + num);

    num %= 3; // Same as num = num % 3
    System.out.println("After num %= 3: " + num);
    System.out.println();
    //  ==========================================================================
    // Logical operators
    System.out.println("=== Logical Operators ===");
    boolean x = true;
    boolean y = false;

    System.out.println("x = " + x + ", y = " + y);

    System.out.println("Logical AND (x && y): " + (x && y));
    System.out.println("Logical OR  (x || y): " + (x || y));
    System.out.println("Logical NOT (!x): " + (!x));
    System.out.println("Logical NOT (!y): " + (!y));
    System.out.println();

    // Logical operators with conditions
    System.out.println("=== Logical Operators with Conditions ===");
    int p = 10, q = 20;

    System.out.println("p = " + p + ", q = " + q);

    System.out.println("(p < q) && (p > 5): " + ((p < q) && (p > 5)));
    System.out.println("(p > q) || (q > 5): " + ((p > q) || (q > 5)));
    System.out.println("!(p == q): " + !(p == q));
    System.out.println();
    //  ==========================================================================
    // Bitwise operators
    System.out.println("=== Bitwise Operators ===");
    int x1 = 6; // 6  = 110 (binary)
    int y1 = 3; // 3  = 011 (binary)

    System.out.println("x1 = " + x1 + " (binary 110)");
    System.out.println("y1 = " + y1 + " (binary 011)");

    System.out.println("Bitwise AND (x1 & y1): " + (x1 & y1)); // 110 & 011 = 010 = 2
    System.out.println("Bitwise OR  (x1 | y1): " + (x1 | y1)); // 110 | 011 = 111 = 7
    System.out.println("Bitwise XOR (x1 ^ y1): " + (x1 ^ y1)); // 110 ^ 011 = 101 = 5
    System.out.println("Bitwise NOT (~x1): " + (~x1)); // ~110 = ... inverted
    System.out.println();

    System.out.println("=== Bitwise Shift Operators ===");
    int s = 8; // 8 = 1000 in binary

    System.out.println("s = " + s + " (binary 1000)");

    System.out.println("Left Shift  (s << 1): " + (s << 1)); // 1000 -> 10000 = 16
    System.out.println("Right Shift (s >> 1): " + (s >> 1)); // 1000 -> 0100  = 4
    System.out.println("Unsigned Right Shift (s >>> 1): " + (s >>> 1));
    System.out.println();
    //  ==========================================================================
    // Relational operators
    System.out.println("=== Relational Operators ===");
    int r1 = 10;
    int r2 = 20;

    System.out.println("r1 = " + r1 + ", r2 = " + r2);

    System.out.println("Equal to (r1 == r2): " + (r1 == r2));
    System.out.println("Not equal (r1 != r2): " + (r1 != r2));
    System.out.println("Greater than (r1 > r2): " + (r1 > r2));
    System.out.println("Less than (r1 < r2): " + (r1 < r2));
    System.out.println("Greater than or equal (r1 >= r2): " + (r1 >= r2));
    System.out.println("Less than or equal (r1 <= r2): " + (r1 <= r2));
    System.out.println();
  }
}
