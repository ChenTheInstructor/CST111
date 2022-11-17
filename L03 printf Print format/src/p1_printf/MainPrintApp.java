package p1_printf;

import java.util.Scanner;

public class MainPrintApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // create a Scanner object
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter your major: ");
		String major = scanner.nextLine();
		
		System.out.println("Hi, " + name);
		System.out.println("Your price is " + price);
		System.out.println("Your age is " + age);
		System.out.println("Your major is " + major);
		
		
	}
	
	public static void showMenu() {
		String format = "%-5s%-10s%10.2f\t%-5s%-10s%10.2f%n";
		String format2 = "%-5s%-10s%10s\t%-5s%-10s%10s%n";
		System.out.println("\t\t\tABC Restaurant");
		System.out.println("\t\t\t(631) 123-4567");
		System.out.println();
		System.out.printf(format, "1.", "Fish", 19.99, "3.", "Eggs", 5.99);
		System.out.printf(format2, " ", "Grilled Fish", " ", " ", "Boiled Eggs", " ");
		System.out.printf(format, "2.", "Beef", 29.99, "4.", "Lamb", 16.99);
		System.out.println();
	}

}
