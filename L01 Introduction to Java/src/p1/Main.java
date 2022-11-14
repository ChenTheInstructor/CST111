package p1;

public class Main {
	public static void main(String[] args) { // main method. starting point
		String format = "%-15d%10S%15.2f%n";
		String line = "------------------------------------------------------";
		int n = 1;
		System.out.println("\t\tLos Pollos Hermanos"); // String in double quotes
		System.out.println("\t\t   631-123-4567");
		System.out.println(line);
//		System.out.println("bye, my friend!");
//		System.out.println();
		System.out.printf(format, n, "Pollo", 9.23424567);
		System.out.printf(format, ++n, "Tacos", 19.99);
//		System.out.printf(format, ++n, "Fish", 19.99);
		System.out.printf(format, ++n, "Beef", 19.99);
		System.out.println(line);
	}
}
