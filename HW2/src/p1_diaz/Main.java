package p1_diaz;

public class Main {

	public static void main(String[] args) {
		displayBanner();
		insertLine();
		showBlankLine();
		show2Items(item1, item1price, item2, item2price, item1line1, item2line1, item1line2, item2line2, item1line3,
				item2line3);
		show2Items(item3, item3price, item4, item4price, item3line1, item4line1, item3line2, item4line2, item3line3,
				item4line3);
		showBlankLine();
		show2Items(item5, item5price, item6, item6price, item5line1, item6line1, item5line2, item6line2, item5line3,
				item6line3);
		showBlankLine();
		show2Items(item7, item7price, item8, item8price, item7line1, item8line1, item7line2, item8line2, item7line3,
				item8line3);
		show2Items(item9, item9price, item10, item10price, item9line1, item10line1, item9line2, item10line2, item9line3,
				item10line3);
		insertLine();

	}

	public static void insertLine() {
		System.out.println("\n----------------------------------------------"
				+ "-----------------------------------------------" + "---------------");
	}

	public static void showBlankLine() {
		System.out.println(" ");
	}

	public static void show2Items(String item1, String item1price, String item2, String item2price, String item1line1,
			String item2line1, String item1line2, String item2line2, String item1line3, String item2line3) {
		System.out.printf(itemFormat, item1, item1price, item2, item2price);
		System.out.printf(detailFormat, item1line1, blank, item2line1);
		System.out.printf(detailFormat, item1line2, blank, item2line2);
		System.out.printf(detailFormat, item1line3, blank, item2line3);
	}

	private static void displayBanner() {
		System.out.printf("%n\t%-30s%n", "La Trattoria");
		System.out.printf("\t%-30s%n", "Dinner Menu served from 6:00 PM to 12:00 AM");
	}

	static String itemFormat = "\t%-40s%-10s%-40s%-11s%n";
	static String detailFormat = "\t%-40s%-10s%-40s%n";

	static String item1 = "Cavatelli";
	static String item1price = "$15";
	static String item2 = "Lobster Ravioli";
	static String item2price = "$24";
	static String item1line1 = "Rolled dumplings served with our";
	static String item2line1 = "Lobster-filled ravioli in a vodka cream";
	static String item1line2 = "homemade tomato basil sauce.";
	static String item2line2 = "sauce topped with grilled shrimp.";
	static String item1line3 = " ";
	static String item2line3 = " ";

	static String item3 = "Caesar Salad";
	static String item3price = "$12";
	static String item4 = "Caprese";
	static String item4price = "$14";
	static String item3line1 = "Romaine lettuce, grape tomatoes, and";
	static String item4line1 = "Layers of ripe tomatoes, fresh mozzarella,";
	static String item3line2 = "cruetons tossed in a delicious Caesar";
	static String item4line2 = "and basil with balsamic reduction";
	static String item3line3 = "dressing.";
	static String item4line3 = "drizzle.";

	static String item5 = "Chicken Piccatta";
	static String item5price = "$21";
	static String item6 = "Trattoria Salmon";
	static String item6price = "$25";
	static String item5line1 = "Lightly floured and sautéed in a white";
	static String item6line1 = "Pan seared and served with a lemon,";
	static String item5line2 = "wine, lemon, capers, and butter. Served";
	static String item6line2 = "butter and caper sauce. Served over";
	static String item5line3 = "over linguine.";
	static String item6line3 = "linguine.";

	static String item7 = "Stuffed Hot Banana Peppers";
	static String item7price = "$13";
	static String item8 = "Mozzrella Sticks";
	static String item8price = "$9";
	static String item7line1 = "Three cheese-stuffed HOT banana peppers";
	static String item8line1 = "Served with tomato basil sauce.";
	static String item7line2 = "served with our tomato basil sauce.";
	static String item8line2 = " ";
	static String item7line3 = " ";
	static String item8line3 = " ";

	static String item9 = "Cheese Tortellini";
	static String item9price = "$21";
	static String item10 = "Lamb Chops with Mediterranean Risotto";
	static String item10price = "$35";
	static String item9line1 = "Cheese-filled tortellini in a creamy";
	static String item10line1 = "Three lamb chops with risotto with";
	static String item9line2 = "beef sauce.";
	static String item10line2 = "zucchini, scallions, and bruschetta,";
	static String item9line3 = " ";
	static String item10line3 = "and served with grilled asparagus.";

	static String blank = " ";

}
