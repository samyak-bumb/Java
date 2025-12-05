import java.util.Scanner;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  // Taking inputs & trimming whitespace using nextLine().trim()
  System.out.print("Enter marks of Subject 1: ");
  int s1 = Integer.parseInt(sc.nextLine().trim());

  System.out.print("Enter marks of Subject 2: ");
  int s2 = Integer.parseInt(sc.nextLine().trim());

  System.out.print("Enter marks of Subject 3: ");
  int s3 = Integer.parseInt(sc.nextLine().trim());

  int total = s1 + s2 + s3;
  float percentage = total / 3.0f;

  // Conditions
  if (percentage >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
    System.out.println("Pass");
  } else {
    System.out.println("Fail");
  }

  sc.close();
}
