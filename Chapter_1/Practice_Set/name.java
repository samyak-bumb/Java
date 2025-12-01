import java.util.Scanner;

public class name {

  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String sName = name.nextLine();
    System.out.println("Hello " + sName + ", nice to meet you!");
    name.close();
  }
}
