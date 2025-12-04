import java.util.Scanner;

public class ConditionalOperatorsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    // ----------------------------------------------------
    // Using Arithmetic + Relational + Logical Together
    // ----------------------------------------------------
    if ((n + 10) > 20 && (n - 5) < 50) { // arithmetic + relational + logical
      System.out.println(
        "Condition 1: Arithmetic + Relational + Logical worked!"
      );
    }

    // ----------------------------------------------------
    // Using Assignment Operator INSIDE condition (trick)
    // ----------------------------------------------------
    int x = n;
    if ((x += 5) > n) { // assignment + relational
      System.out.println(
        "Condition 2: Assignment inside conditional executed."
      );
    }

    // ----------------------------------------------------
    // Using Increment & Decrement in Conditional
    // ----------------------------------------------------
    int y = n;
    if (++y > n) { // pre-increment + relational
      System.out.println("Condition 3: Pre-increment made y > n.");
    }

    if (y-- >= 0) { // post-decrement + relational
      System.out.println("Condition 4: Post-decrement still kept y >= 0.");
    }

    // ----------------------------------------------------
    // Bitwise Operators in Conditional
    // ----------------------------------------------------
    int a = 6; // 110
    int b = 3; // 011

    if ((a & b) == 2) { // bitwise AND + relational
      System.out.println("Condition 5: Bitwise AND result matched.");
    }

    if ((a | b) == 7) { // bitwise OR + relational
      System.out.println("Condition 6: Bitwise OR result matched.");
    }

    if ((a ^ b) == 5) { // bitwise XOR + relational
      System.out.println("Condition 7: Bitwise XOR result matched.");
    }

    if ((a << 1) == 12) { // left shift + relational
      System.out.println("Condition 8: Left shift is correct.");
    }

    if ((a >> 1) == 3) { // right shift + relational
      System.out.println("Condition 9: Right shift is correct.");
    }

    // ----------------------------------------------------
    // Ternary Operator inside a conditional
    // ----------------------------------------------------
    String msg = (n >= 18) ? "Adult" : "Minor"; // ternary operator

    if (msg.equals("Adult")) { // conditional check
      System.out.println("Condition 10: Ternary decided you are an Adult.");
    } else {
      System.out.println("Condition 10: Ternary decided you are a Minor.");
    }

    sc.close();
  }
}
