import java.util.Scanner;

public class Q3IncomeTax {

  // Safe Indian formatting (handles numbers below 1000)
  public static String formatIndian(long amount) {
    String s = Long.toString(amount);
    int len = s.length();

    // If number has only 1,2, or 3 digits → return as-is
    if (len <= 3) {
      return s;
    }

    StringBuilder sb = new StringBuilder();

    // Last 3 digits
    sb.append(s.substring(len - 3));
    len -= 3;

    // Add commas for remaining digits
    while (len > 0) {
      sb.append(",");
      sb.append(s.substring(Math.max(0, len - 2), len));
      len -= 2;
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter your annual income in INR: ");
      String input = sc.nextLine().trim();

      long income = Long.parseLong(input);

      if (income < 0) {
        System.out.println("Income cannot be negative.");
        return;
      }

      double tax = 0;

      // -------- Tax Slabs --------
      if (income <= 250000) {
        tax = 0;
      } else if (income <= 500000) {
        tax = (income - 250000) * 0.05;
      } else if (income <= 1000000) {
        tax = (250000 * 0.05) + ((income - 500000) * 0.20);
      } else {
        tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
      }

      long finalTax = Math.round(tax);

      System.out.println("Total Tax Payable: Rs. " + formatIndian(finalTax));
    } catch (NumberFormatException e) {
      System.out.println("Invalid input! Please enter a number.");
    }

    sc.close();
  }
}
