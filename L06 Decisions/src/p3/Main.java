package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		showMenu();
		int itemNumber = chooseItem();
		showOrder(itemNumber);
		double price = getDishPrice(itemNumber);
		double tax = getTax(price);
		showTax(tax);
//		showDishOrdered(itemNumber);
//		showDishPrice(itemNumber);
	}
	
	public static void showTax(double tax) {
		String format = "%-5s%20s%20.2f%n";
		System.out.printf(format, "Taxes", "", tax);
	}
	
	public static double getTax(double amount) {
		return amount * 0.0825;
	}

	public static void showOrder(int itemNumber) {
		String format = "%-5s%20s%20.2f%n";
		System.out.println("The order is: ");
		System.out.printf(format, (itemNumber + "."), getDishName(itemNumber), getDishPrice(itemNumber));
	}

	public static double getDishPrice(int itemNumber) {
		double price = 0.0;
		if (itemNumber == 1) {
			price = 19.99;
		} else if (itemNumber == 2) {
			price = 15.99;
		} else if (itemNumber == 3) {
			price = 9.99;
		} else if (itemNumber == 4) {
			price = 14.99;
		} else {
//			System.out.println("No such item number.");
			price = 0.0;
		}
		return price;
	}

	public static String getDishName(int itemNumber) {
		String dish;
		if (itemNumber == 1) {
			dish = "fish";
		} else if (itemNumber == 2) {
			dish = "beef";
		} else if (itemNumber == 3) {
			dish = "pork";
		} else if (itemNumber == 4) {
			dish = "lamb";
		} else {
//			System.out.println("No such item number.");
			dish = "";
		}
		return dish;
	}

	public static void showDishPrice(int itemNumber) {
		if (itemNumber == 1) {
			System.out.println(19.99);
		} else if (itemNumber == 2) {
			System.out.println(15.99);
		} else if (itemNumber == 3) {
			System.out.println(9.99);
		} else if (itemNumber == 4) {
			System.out.println(14.99);
		} else {
			System.out.println("No such item number.");
		}
	}

	public static void showDishOrdered(int itemNumber) {
		if (itemNumber == 1) {
			System.out.println("You ordered fish.");
		} else if (itemNumber == 2) {
			System.out.println("You ordered beef.");
		} else if (itemNumber == 3) {
			System.out.println("You ordered pork.");
		} else if (itemNumber == 4) {
			System.out.println("You ordered lamb.");
		} else {
			System.out.println("No such item number.");
		}
	}

	public static int chooseItem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the item number for the dish you would like to order: ");
		return scanner.nextInt();
	}

	public static void showMenu() {
		String format = "%-5s%20s%20.2f%n";
		System.out.println("\t\tABC Restaurant");
		System.out.println("\t\t(631)123-4567");
		System.out.println("--------------------------------------------");
		System.out.printf(format, "1.", "Fish", 19.99);
		System.out.printf(format, "2.", "Beef", 15.99);
		System.out.printf(format, "3.", "Pork", 9.99);
		System.out.printf(format, "4.", "Lamb", 14.99);
		System.out.println("--------------------------------------------");
	}

}
