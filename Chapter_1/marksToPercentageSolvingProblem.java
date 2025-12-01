import java.util.Scanner;

public class marksToPercentageSolvingProblem {

  public static void main(String[] args) {
    int sub1, sub2, sub3, sub4, sub5, ans;

    Scanner any = new Scanner(System.in);

    System.out.print("Enter the marks of subject 1: ");
    sub1 = any.nextInt();
    System.out.print("Enter the marks of subject 2: ");
    sub2 = any.nextInt();
    System.out.print("Enter the marks of subject 3: ");
    sub3 = any.nextInt();
    System.out.print("Enter the marks of subject 4: ");
    sub4 = any.nextInt();
    System.out.print("Enter the marks of subject 5: ");
    sub5 = any.nextInt();

    ans = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
    System.out.println("Your percentage is: " + ans + "%");
  }
}
