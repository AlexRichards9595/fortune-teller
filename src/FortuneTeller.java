import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String firstName = input.next();
		System.out.println("Please enter your last name:");
		String lastName = input.next();
		System.out.println("Please enter your age:");
		int age = input.nextInt();
		System.out.println("Please enter your birth month:");
		int birthMonth = input.nextInt();
		System.out.println("Please enter your favorite color");
		System.out.println("If you do not know what ROYGBIV is, please type \"help\"");
		String color = input.next();
		if (color.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			System.out.println("Now please enter your favorite of those colors.");
			color = input.next();
		}
	}

}
