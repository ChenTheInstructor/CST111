package p2;

import java.util.Scanner;

public class MainCalculatorApp {

	public static void main(String[] args) {
		// This app does addition of numbers of double type
		double n1 = getNumber();
		double n2 = getNumber();
		
		double sum = add(n1, n2);
		showResult(sum);
		
		double difference = subtract(n1, n2);
		showResult(difference);
		
		double product = multiply(n1, n2);
		showResult(product);
		
		double result = divide(n1, n2);
		showResult(result);
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double multiply(double number1, double number2) {
		double result = number1 * number2;
		return result;
	}
	
	public static double subtract(double n1, double n2) {
		double result = n1 - n2;
		return result;
	}
	
	public static void showResult(double number) {
		System.out.println("The result is: " + number);
	}
	
	public static double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = scanner.nextDouble();
		return number;
	}

}
