import java.util.Scanner;

public class GreetingProgram {
	public static void main(String[] args) {
		// we created obj Scanner to enter data from keyboard
		Scanner scanner = new Scanner(System.in);

		// Declaring about variables
		String name; // var to save and keep name of user
		int age; // reader of data

		// Nameing request
		System.out.print("Enter your name: ");
		name = scanner.nextLine(); // reading the string

		// The request of age
		System.out.print("Enter your age:");
		age = scanner.nextInt(); // reading integer (age)

		// Print greatings and cout age after 5 years
		System.out.println("Hello, " + name + " NIce to meet you!");
		System.out.println("Your age now is " + age + "years old.");
		System.out.println("After five years you will be " + (age + 5) + "years");

		//Closed of the scanner to free up of the resources
		scanner.close();
	}
}
