package p3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Student {
	
	private String firstName;
	private String lastName;
	private int studentID;
	private int phoneNum;
	private LocalDate regDate;
	private LocalTime regTime;
	
	
	private static int uniqueID;
	
	public Student (String firstName, String lastName, int phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = getNextStudentID();
		this.phoneNum = phoneNum;
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
		return Objects.hash(firstName, lastName, phoneNum, regDate, regTime, studentID);
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
				&& phoneNum == other.phoneNum
				&& Objects.equals(regDate, other.regDate) && Objects.equals(regTime, other.regTime)
				&& studentID == other.studentID;
	}


	@Override
	public String toString() {
		return "Student [name=" + firstName + " " + lastName + ", studentID=" + studentID + ", phoneNum=" + phoneNum
				+ ", regDate=" + regDate + ", regTime=" + regTime + "]";
	}
	
	


	

}
