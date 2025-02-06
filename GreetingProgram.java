import java.util.Scanner;

public class GreetingProgram {
	public static void main(String[] args) {
		// we created obj Scanner to enter data from keyboard
		Scanner scanner = new Scanner(System.in);

		// Declaring about variables
		String name; // var to save and keep name of user
		int age; // reader of data
		double height; // variable to save heoght of user
		int favoriteNumber; // variabe to save favorite number

		// Nameing request
		System.out.print("Enter your name: ");
		name = scanner.nextLine(); // reading the string (Name)

		// The request of age
		System.out.print("Enter your age: ");
		age = scanner.nextInt(); // reading integer (age)

		// Height request
		System.out.print("Add your height (meters): ");
		height = scanner.nextDouble(); //Reading the number with the floating point

		// Request of favorite number
		System.out.print("Add your favorite number: "); // reading integer (age)
		favoriteNumber = scanner.nextInt(); // Reading integer number (favorite number)


		// Print greatings and cout age after 5 years
		System.out.println("Hello, " + name + " nice to meet you!");
		System.out.println("Your age now is " + age + "years old.");
		System.out.println("After five years you will be " + (age + 5) + "years");
		System.out.println("Your height: " + height + "meters");
		System.out.println("Your favorite number: " + favoriteNumber);
		System.out.println("After 5 years your favorite color will be " + (favoriteNumber + 5));

		//Closed of the scanner to free up of the resources
		scanner.close();
	}
}
