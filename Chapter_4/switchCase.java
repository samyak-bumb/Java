// switch-case: A multi-way decision statement that chooses one block of code
// Based on the value of a single expression (like a number or string).
// But switch case is rarely used in modern Java, as if-else statements & polymorphism are often preferred
public static void main(String[] args) {
  int day = 3; // Value to check
  String dayName; // Variable to store result

  // switch checks the value of 'day' and matches it with the correct case
  switch (day) {
    case 1:
      dayName = "Monday"; // If day = 1
      break; // stop here
    case 2:
      dayName = "Tuesday"; // If day = 2
      break;
    case 3:
      dayName = "Wednesday"; // If day = 3 → this will run
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
      dayName = "Invalid day"; // Runs if no case matches
      break;
  }

  System.out.println("The day is: " + dayName);
}
