import java.util.Scanner;

public class conditionals {

  public static void main(String[] args) {
    System.out.println("Sex Detecter");
    Scanner sex = new Scanner(System.in);
    System.out.print("Enter Your age :- ");
    int age = sex.nextInt();

    if (age < 18) {
      System.out.println("Get the fuck out of here kid.");
    } else if (age >= 18 && age < 50) {
      System.out.println("You are ready for sex");
    } else if (age > 50) {
      System.out.println(
        "You’re 50+. You should be asking for peace, not proposals"
      );
    } else {
      System.out.println("Fuck You");
    }
  }
}
