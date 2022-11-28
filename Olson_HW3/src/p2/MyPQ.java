package p2;

import java.util.ArrayList;

public class MyPQ {
	private int maxSize;
	private ArrayList<Double> queArray;
	private int nElems;
	
	public MyPQ() {
		queArray = new ArrayList<Double>();
	}
	
	public boolean isEmpty() {
		return queArray.isEmpty();
	}
	
	public int size() {
		return queArray.size();
	}
	
	public double remove() {
		return queArray.remove(queArray.size()-1);
	}
	
	public void insert(double num) {
		int j;
		if(queArray.isEmpty()) {
			queArray.add(num);
		}
		else { // not empty. need to shift all smaller values up
			for(int i = queArray.size()-1; i >= 0; i--) { //loop through the queue starting at the minimum
				//put the greater numbers at the front
				//if you find a value greater than the one you're trying to insert then place the value to insert after that one
				if(num < queArray.get(i)) {
					queArray.add(i+1, num);
					return;
				}
			}
			queArray.add(0, num); //if the value is greater than current max, then insert "behind" the current max
		}
		
		
	}
}
