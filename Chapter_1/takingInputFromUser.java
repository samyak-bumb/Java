import java.util.Scanner;

// I made a mistake here
// "public void" while its public class

public class takingInputFromUser{
	public static void main(String []args){
		System.out.println("Taking Input From User");

		// The Scanner class is used to take input from the user
		Scanner anyObjHere = new Scanner(System.in);

		// boolean a = anyObjHere.hasNextInt();
		// System.out.println(a);

		// System.out.print("Enter your age: ");
		// // int age = anyObjHere.nextInt();
		// // OR
		// int age = anyObjHere.nextByte();
		// System.out.println("Your age is: " + age);
		/* Used to just get one word*/
		// String str = anyObjHere.next();
		String str = anyObjHere.nextLine();
		System.out.println("You entered: " + str);
	}
}