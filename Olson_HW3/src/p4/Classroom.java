package p4;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;


public class Classroom {
	
	private ArrayBlockingQueue<Student> regStudents;
	private PriorityQueue<Student> waitList;
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
		this.waitList = new PriorityQueue<Student>(10, (o1, o2) -> {
			return -Double.compare(o1.getGpa(), o2.getGpa());
		});
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

	public PriorityQueue<Student> getWaitList() {
		return waitList;
	}

	public void setWaitList(PriorityQueue<Student> waitList) {
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
			waitList.add(student);
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
		
		int count = waitList.size();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count; i++) {
			sb.append(waitList.remove()).append("\n");
		}
		
		return sb.toString();
	}
	
	
	
	

}
