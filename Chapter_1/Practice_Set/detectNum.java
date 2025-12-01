import java.util.Scanner;

public class detectNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your number: ");

    System.out.println(sc.hasNextInt());
  }
}
