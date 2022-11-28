package p1_intro;

public class Main {

	public static void main(String[] args) {
//		int x  = 5; // assign value 5 to the variable x. Store 5 into variable x
//		System.out.println(x);
		
		// variable = value; = means assignment in computer science. it does not mean equal
		String x  = "D"; 
		String y = "D";
//		boolean a = (x.equals(y)); // ! negate a boolean value
//		int n = y.compareTo(y);
//		System.out.println(n);
		if(x.compareTo(y) > 0) {
			System.out.println("x is bigger than y.");
		} else {
			System.out.println("x is not bigger than y.");
		}
	}

}
