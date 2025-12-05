import java.util.*;

class switchChar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character (a, b, c): ");
    char ch = sc.next().charAt(0);

    switch (ch) {
      case 'a':
        System.out.println("You entered A");
        break;
      case 'b':
        System.out.println("You entered B");
        break;
      case 'c':
        System.out.println("You entered C");
        break;
      default:
        System.out.println("Invalid character");
    }
  }
}
