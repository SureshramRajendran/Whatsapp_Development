package Preparation;

public class Student {
	
	private String studentName;
	private int studentAge;
	private String fatherName;
	private char studentSection;
	private String studentGender;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public char getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(char studentSection) {
		this.studentSection = studentSection;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public Student(String studentName, int studentAge, String fatherName, char studentSection, String studentGender) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.fatherName = fatherName;
		this.studentSection = studentSection;
		this.studentGender = studentGender;
	}
	@Override
	public String toString() {
		return "Student [Student Name=" + studentName + ", Student age=" + studentAge + ", fatherName=" + fatherName + ", Student section=" + studentSection
				+ ", Student gender=" + studentGender + "]";
	}
	
	
	
	

}
