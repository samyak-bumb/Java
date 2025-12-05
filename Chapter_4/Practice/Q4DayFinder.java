import java.util.Scanner;

public class Q4DayFinder {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter day number (1 to 7): ");
    int day = Integer.parseInt(sc.nextLine().trim());

    String dayName;

    switch (day) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "Invalid day";
    }

    System.out.println("Day is: " + dayName);

    sc.close();
  }
}
