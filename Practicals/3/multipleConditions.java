// Program to check multiple conditions using if & logical operators
import java.util.*;

class multipleConditions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age: ");
    int age = sc.nextInt();

    if (age >= 18 && age <= 60) System.out.println("Eligible");
    else if (age < 18 || age > 60) System.out.println("Not eligible");
  }
}
