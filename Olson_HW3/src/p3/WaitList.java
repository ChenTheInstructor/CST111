package p3;

import java.util.ArrayList;

import p3.Student;

public class WaitList {
	private ArrayList<Student> waitList;
	
	public WaitList() {
		waitList = new ArrayList<Student>();
	}

	public ArrayList<Student> getWaitList() {
		return waitList;
	}

	public void setWaitList(ArrayList<Student> waitList) {
		this.waitList = waitList;
	}

	public void push(Student student) {
		waitList.add(student);
	}
	
	public Student pop() {
		return waitList.remove(0);
	}
	
	public Student peek() {
		return waitList.get(0);
	}
	
	public boolean isEmpty() {
		return waitList.isEmpty();
	}

	@Override
	public String toString() {
		return "WaitList [waitList=" + waitList + "]";
	}
	
	

}
