import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Asking for first name
		System.out.println("Please enter your first name:");
		String firstName = input.next();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		//Asking for last name
		System.out.println("Please enter your last name:");
		String lastName = input.next();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		//Asking for age
		System.out.println("Please enter your age:");
		String ageString = input.next();
		if (ageString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(ageString);
		
		//Asking for birth month
		System.out.println("Please enter your birth month:");
		String birthMonthString = input.next();
		if (birthMonthString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(birthMonthString);

		
		//Asking for favorite color
		System.out.println("Please enter your favorite ROYGBIV color");
		System.out.println("If you do not know what ROYGBIV is, please type \"help\"");
		String color = input.next(); // why won't nextline work here?
		while (color.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			System.out.println("Now please enter your favorite of those colors.");
			color = input.next();
		}
		if (color.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		// Asking for Siblings
		System.out.println("Please enter the number of siblings that you have:");
		String siblingsString = input.next();
		if (siblingsString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int siblings = Integer.parseInt(siblingsString);

		// Setting years until retirement
		int retirementYears;
		if (age % 2 == 0) {
			retirementYears = 3;
		} else {
			retirementYears = 37;
		}

		// Where you will retire
		String vacationHome;
		if (siblings == 0) {
			vacationHome = ("Johannesburg, South Africa");
		} else if (siblings == 1) {
			vacationHome = ("Moscow, Russia");
		} else if (siblings == 2) {
			vacationHome = ("Cabo, Mexico");
		} else if (siblings == 3) {
			vacationHome = ("Seattle, Washington");
		} else if (siblings > 3) {
			vacationHome = ("Tampa Florida");
		} else {
			vacationHome = "Columbus, Ohio (haha)";
		}

		// What you will drive
		String transportation;
		if (color.equalsIgnoreCase("red")) {
			transportation = ("a red Ferrari");
		} else if (color.equalsIgnoreCase("orange")) {
			transportation = ("a VW bus");
		} else if (color.equalsIgnoreCase("yellow")) {
			transportation = ("a Ducati");
		} else if (color.equalsIgnoreCase("green")) {
			transportation = ("some gas guzzler");
		} else if (color.equalsIgnoreCase("blue")) {
			transportation = ("a prius");
		} else if (color.equalsIgnoreCase("indigo")) {
			transportation = ("an audi R8");
		} else if (color.equalsIgnoreCase("violet")) {
			transportation = ("a hot air balloon");
		} else {
			transportation = ("your mom's old bike");
		}

		// Your bank account balance
		double bankAccount;
		if (birthMonth > 0 && birthMonth <= 4) {
			bankAccount = 95.34;
		} else if (birthMonth > 4 && birthMonth <= 8) {
			bankAccount = 584736.97;
		} else if (birthMonth > 8 && birthMonth <= 12) {
			bankAccount = 8000004.00;
		} else {
			bankAccount = 0.00;
		}

		// Final output
		System.out.println(firstName.trim() + " " + lastName.trim() + " will retire in " + retirementYears
				+ " years with $" + bankAccount + " in the bank, a vacation home in " + vacationHome
				+ ", and travel by " + transportation + ".");

	}

}
