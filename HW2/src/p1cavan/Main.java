package p1cavan;

public class Main {
		static String itemFormat = "\t%-40s%-10s%-40s%-10s%n";
		static String detailFormat = "\t%-40s%-10s%40s%n"; 
		static String item1 = "Chicken Wings"; 
		static String item1Price = "10";
		static String item2 = "Orange Chicken";
		static String item2Price = "8";
		static String item1Line1 = "Topped with curry";
		static String item2Line1 = "Topped with curry";
		static String item1Line2 = "Served with cookies";
		static String item2Line2 = "Served with cookies";
		
		static String item3 = "Popcorn Shrimp";
		static String item3Price = "9";
		static String  item4 = "Crab Cakes";
		static String item4Price = "14";
		static String item3Line1 = "Beer batter, red sauce";
		static String item4Line1 = "Finest from Maryland";
		static String item3Line2 = "Fried ketchup, chipotle mayo";
		static String item4Line2 = "Grilled nuggets, sauteed onions";

	public static void main(String[] args) {
//		showLine();
		
		displayBanner();
		showBlankLines();
		show2Items(item1, item1Price, item2, item2Price, item1Line1, item2Line1, item1Line2, item2Line2); 
		showBlanklLine();
		show2Items(item3, item3Price, item4, item4Price, item3Line1, item4Line1, item3Line2, item4Line2);
		showBlankLines();
		
		
		

	}

	private static void showBlanklLine() {
		System.out.println("n"); 
		
	}

	private static void showBlankLines() {
		System.out.println("n\n");
		
	}

	private static void show2Items(String item12, String item1Price2, String item22, String item2Price2,
			String item1Line12, String item2Line12, String item1Line22, String item2Line22) {
		// TODO Auto-generated method stub
		System.out.printf(itemFormat, item1, item1Price, item2, item2Price);
		System.out.printf(detailFormat, item1Line1, " ", item2Line1);
		System.out.printf(detailFormat, item1Line2, " ", item2Line2);
	}

	private static void displayBanner() {
			System.out.printf("%n\t\t%-30s\\n)", "American Specials");
			System.out.printf("t\t%%-30s%n", "Highly Ranked menu");
	
		// TODO Auto-generated method stub
		
	}
	
	public static void showLine() {
		System.out.println("--------------------------");
	}
}