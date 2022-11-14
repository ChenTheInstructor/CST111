package p1_menu;

public class MainApp {
	static String itemFormat = "\t%-40s%-10s%-40s%-10s%n";
	static String detailFormat = "\t%-40s%-10s%-40s%n";
	static String item1 = "Party Roll";
	static String item1Price = "12";
	static String item2 = "Kentucky Roll";
	static String item2Price = "14";
	static String item1Line1 = "Smoked Salmon, Fried Cream Cheese";
	static String item2Line1 = "Smoked Salmon, Fried Cream Cheese";
	static String item1Line2 = "Grilled Jalapeno, Avacado";
	static String item2Line2 = "Grilled Jalapeno, Avacado";
	
	static String item3 = "Eel Roll";
	static String item3Price = "16";
	static String item4 = "Crab Roll";
	static String item4Price = "18";
	static String item3Line1 = "Smoked Eel, Fried Cheese";
	static String item4Line1 = "Roasted Bass, Boild Cheese";
	static String item3Line2 = "Fried Jalapeno, Salty Avacado";
	static String item4Line2 = "Grilled Jalapeno, Fried Avacado";

	public static void main(String[] args) { // main method
//		showLine();

		displayBanner();
		showBlankLines();
		show2Items(item1, item1Price, item2, item2Price, item1Line1, item2Line1, item1Line2, item2Line2);
		showBlankLine();
		show2Items(item3, item3Price, item4, item4Price, item3Line1, item4Line1, item3Line2, item4Line2);
		showBlankLines();

	}

	public static void show2Items(String item1, String item1Price, String item2, String item2Price, 
			String item1Line1, String item2Line1, String item1Line2, String item2Line2) {
		System.out.printf(itemFormat, item1, item1Price, item2, item2Price);
		System.out.printf(detailFormat, item1Line1, " ", item2Line1);
		System.out.printf(detailFormat, item1Line2, " ", item2Line2);
	}

	private static void displayBanner() { // method
		System.out.printf("%n\t%-30S\n", "Specialty Sushi");
		System.out.printf("\t%-30s%n", "This is highly ranked menu");
	}

	public static void showLine() {
		System.out.println("---------------------------------------------");
	}

	public static void showBlankLines() {
		System.out.println("\n\n");
	}

	public static void showBlankLine() {
		System.out.println("n");
	}

}
