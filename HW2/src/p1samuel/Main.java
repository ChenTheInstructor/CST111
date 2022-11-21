package p1samuel;

public class Main {
	static String itemFormat = "\t%-40s%-10s%-40s%-10s%n";
	static String detailFormat = "\t%-40s%-10s%-40s%n";
	/*-----------------------------------------------------*/
	static String item1 = "Party Roll";
	static String item1Price = "12";
	static String item2 = "Kentucky Roll";
	static String item2Price = "14";
	static String item1Line1 = "Smoked salmon, fried cream cheese";
	static String item2Line1 = "Spicy lobster, soy peper and carrot";
	static String item1Line2 = "and Grilled Jalapeno.";
	static String item2Line2 = "toppec with seared tuna, salmon and avocado.";
	/*-----------------------------------------------------*/
	static String item3 = "Eel Roll";
	static String item3Price = "8.5";
	static String item4 = "Crab Rangoon";
	static String item4Price = "9.5";
	static String item3Line1 = "Cooked eel, cucumber, avocado, seaweed,";
	static String item4Line1 = "Crab and cream blend seaweed,";
	static String item3Line2 = "sesame seeds, sushi sauce.";
	static String item4Line2 = "topped with sushi sauce and sweet chili sauce.";
	/*-----------------------------------------------------*/
	static String item5 = "Dragon Roll";
	static String item5Price = "9.5";
	static String item6 = "Fried Scallop Roll";
	static String item6Price = "9";
	static String item5Line1 = "Cooked eel, cucumber,seaweed,";
	static String item6Line1 = "Soy paper, fried scallop, avocado;";
	static String item5Line2 = "wrapped in avocado and sesame seeds.";
	static String item6Line2 = "topped with red tobiko and spicy mayo.";
	/*-----------------------------------------------------*/

	public static void main(String[] args) {
		showBanner();
		showLine();
		showBlankLines();
		showTwoItems(item1, item1Price, item2, item2Price, item1Line1, item2Line1, item1Line2, item2Line2);
		showBlankLine();
		showTwoItems(item3, item3Price, item4, item4Price, item3Line1, item4Line1, item3Line2, item4Line2);
		showBlankLines();
		showTwoItems(item5, item5Price, item6, item6Price, item5Line1, item6Line1, item5Line2, item6Line2);
		showBlankLine();
	}// End Main

	private static void showBlankLines() {
		// TODO Auto-generated method stub
		System.out.println("\n\n");
	}// End showBlankLines

	private static void showBanner() {
		// TODO Auto-generated method stub
		System.out.printf("\n\t%-30S%n", "specialty sushi");
		System.out.printf("\t%-30s%n", "This is a highly ranked menu.");
	}// End showBanner

	private static void showLine() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
	}// End showLine

	public static void showTwoItems(String item1, String item1Price, String item2, String item2Price, String item1Line1,
			String item2Line1, String item1Line2, String item2Line2) {
		/*
		 * System.out.printf(itemFormat, "Party Roll", "12", "Kentucky Roll", "14");
		 * System.out.printf(detailFormat, "Smoked Salmon, Fried Cream Cheese", " ",
		 * "Grilled Jalapeño, Grilled Jalapeño"); System.out.printf(detailFormat,
		 * "Grilled Jalapeño", " ", "Grilled Jalapeño Avocado");
		 */
		System.out.printf(itemFormat, item1, item1Price, item2, item2Price);
		System.out.printf(detailFormat, item1Line1, " ", item2Line1);
		System.out.printf(detailFormat, item1Line2, " ", item2Line2);
	}// End showTwoItems

	public static void showBlankLine() {
		System.out.println("\n");
	}

}