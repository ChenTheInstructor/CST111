package p1;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList<String> stringList;
	
	public void push(String str) {
		stringList.add(str);
	}
	
	public String pop() {
		String str = stringList.remove(0);
		return str;
	}
	
	public String peek() {
		return stringList.get(0);
	}
	
	public boolean isEmpty() {
		return stringList.isEmpty();
	}

}
