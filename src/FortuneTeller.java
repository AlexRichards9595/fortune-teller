import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Getting all the information
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
		String color = input.next(); //why won't nextline work here?
		if (color.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			System.out.println("Now please enter your favorite of those colors.");
			color = input.next();
		}
		System.out.println("Please enter the number of siblings that you have:");
		int siblings = input.nextInt();
		
		//Setting years until retirement
		int retirementYears;
		if (age%2 == 0) {
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
			vacationHome = "Columbus, Ohio haha";
		}
		
		// What you will drive 
		String transportation;
		if (color.equalsIgnoreCase("red")) {
			transportation = ("a red Ferrari");
		} else  if (color.equalsIgnoreCase("orange")) {
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
			transportation = ("Your mom's old bike");
		}
		
		// Your bank account balance
		int bankAccount;
		if (birthMonth > 0 && birthMonth <= 4 ) {
			bankAccount = 95;
		} else if (birthMonth > 4 && birthMonth <= 8 ) {
			bankAccount = 584736;
		} else if (birthMonth > 8 && birthMonth <= 12 ) {
			bankAccount = 1000000004;
		} else {
			bankAccount = 0;
		}
		
		
		
	}

}
