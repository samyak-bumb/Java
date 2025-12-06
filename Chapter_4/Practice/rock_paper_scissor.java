import java.util.Random;
import java.util.Scanner;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  String[] choices = { "rock", "paper", "scissors" };
  System.out.println("Welcome to Rock, Paper & Scissors!");
  System.out.print("Enter your choice (rock, paper, scissors): ");
  String userChoice = sc.nextLine().toLowerCase();

  // Validate input
  if (
    !userChoice.equals("rock") &&
    !userChoice.equals("paper") &&
    !userChoice.equals("scissors")
  ) {
    System.out.println("Invalid input! Please enter rock, paper, or scissors.");
    return;
  }

  // Computer's choice
  String computerChoice = choices[rand.nextInt(3)];
  System.out.println("Computer chose: " + computerChoice);

  // Determine winner
  if (userChoice.equals(computerChoice)) {
    System.out.println("It's a tie!");
  } else if (
    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
    (userChoice.equals("scissors") && computerChoice.equals("paper"))
  ) {
    System.out.println("You win!");
  } else {
    System.out.println("You lose!");
  }

  sc.close();
}
