package p4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private String firstName;
	private String lastName;
	private int studentID;
	private int phoneNum;
	private double gpa;
	private LocalDate regDate;
	private LocalTime regTime;
	
	
	private static int uniqueID;
	
	public Student (String firstName, String lastName, int phoneNum, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = getNextStudentID();
		this.phoneNum = phoneNum;
		this.gpa = gpa;
		this.regDate = LocalDate.now();
		this.regTime = LocalTime.now();
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNextStudentID() {
		return ++uniqueID;
	}


	public int getStudentID() {
		return studentID;
	}


	public int getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public LocalDate getRegDate() {
		return regDate;
	}


	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}


	public LocalTime getRegTime() {
		return regTime;
	}


	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, gpa, phoneNum, regDate, regTime, studentID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& gpa == other.gpa && phoneNum == other.phoneNum
				&& Objects.equals(regDate, other.regDate) && Objects.equals(regTime, other.regTime)
				&& studentID == other.studentID;
	}


	@Override
	public String toString() {
		return "Student [name=" + firstName + " " + lastName + ", studentID=" + studentID + ", phoneNum=" + phoneNum + ", gpa=" + gpa
				+ ", regDate=" + regDate + ", regTime=" + regTime + "]";
	}


	@Override
	public int compareTo(Student o) {
		return this.firstName.compareTo(o.firstName);
	}
	
	


	

}
