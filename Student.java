package Preparation;

public class Student {
	
	private String name;
	private int age;
	private String fatherName;
	private char section;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, int age, String fatherName, char section, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.section = section;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fatherName=" + fatherName + ", section=" + section
				+ ", gender=" + gender + "]";
	}
	
	
	
	

}
