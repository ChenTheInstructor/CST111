package p3;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import p3.WaitList;

public class Classroom {
	
	private ArrayBlockingQueue<Student> regStudents;
	private WaitList waitList;
	private int maxSize;
	private static Classroom INSTANCE;
	
	public static Classroom getInstance() {
		if (INSTANCE == null) {
            INSTANCE = new Classroom();
        }
        return INSTANCE;
	}
	
	public Classroom() {
		maxSize = 5;
		this.regStudents = new ArrayBlockingQueue<Student>(maxSize);
		this.waitList = new WaitList();
	}
	
	public int getMaxSize() {
		return maxSize;
	}

	public ArrayBlockingQueue<Student> getRegStudents() {
		return regStudents;
	}

	public void setRegStudents(ArrayBlockingQueue<Student> regStudents) {
		this.regStudents = regStudents;
	}

	public WaitList getWaitList() {
		return waitList;
	}

	public void setWaitList(WaitList waitList) {
		this.waitList = waitList;
	}
	
	public boolean addStudent(Student student){
    	if(regStudents.offer(student)) {
    		return true;
    	}
    			
    	addWaitList(student);
    	return false;
    
    }
	
	public void addWaitList(Student student) {
			System.out.println("Class full. Added to waitlist");
			waitList.getWaitList().add(student);
			
	}
	
	public int checkWaitList(Student student) {
		for(int i = 0; i < waitList.getWaitList().size(); i++) {
			if(waitList.getWaitList().get(i).equals(student)){
				return i;
			}
		}
		
		return -1;
	}
	
	public String displayStudents() {
		
		Object[] studentArray = regStudents.toArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < studentArray.length; i++) {
			sb.append(studentArray[i]).append("\n");
		}
		return sb.toString();
	}
	
	public String displayWaitList() {
		StringBuilder sb = new StringBuilder();
		ArrayList<Student> studWait = waitList.getWaitList();
		
		for(int i = 0; i < studWait.size(); i++) {
			sb.append(studWait.get(i)).append("\n");
		}
		return sb.toString();
	}
	
	
	
	

}
