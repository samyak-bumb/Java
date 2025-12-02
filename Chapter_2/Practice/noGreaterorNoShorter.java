import java.util.Scanner;

public static void main(String[] args) {
  int a, b;

  Scanner input = new Scanner(System.in);
  System.out.print("Enter first integer (a): ");
  a = input.nextInt();
  System.out.print("Enter second integer (b): ");
  b = input.nextInt();

  if (a > b) {
    System.out.println("a is greater than b");
  } else if (a == b) {
    System.out.println("a is equal to b");
  } else {
    System.out.println("a is not greater than b");
  }
}
