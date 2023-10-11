package Preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Suresh", 16, "Rajendran", 'A', "Male");
		Student s2 = new Student("Kavi", 19, "Gunasekaran", 'B', "Female");
		Student s3 = new Student("Ram", 19, "Bharath", 'E', "Male");
		Student s4 = new Student("Priya", 16, "Indhran", 'A', "Female");
		Student s5 = new Student("Mukesh", 22, "Rajan", 'B', "Male");

		Student[] st= {s1};
		List<Student> al=Arrays.asList(st);
		
		Student[] st1=al.toArray(new Student[al.size()]);
		
		
		List<Student> students = Arrays.asList(s1, s2);
		List<Student> students1=Arrays.asList(s3,s4,s5);
		List<List<Student>> s=Arrays.asList(students,students1);

		List<String> gen = students.stream().filter(x -> x.getStudentGender().equals("Male"))
				.map(y -> y.getStudentName().concat(y.getFatherName())).collect(Collectors.toList());

		System.out.println(gen);

		System.out.println("************");

		List<String> min = students.stream().map(y -> y.getStudentName()).filter(x -> x.length() <= 4)
				.collect(Collectors.toList());

		System.out.println(min);

		System.out.println("************");

		Long vote = students.stream().filter(x -> x.getStudentGender().equalsIgnoreCase("Male")&&x.getStudentAge()>= 18).count();
		
		System.out.println(vote);
		
		System.out.println("************");
		
		List<String> sort=students.stream().map(x->x.getStudentName()).sorted().toList();
		
		System.out.println(sort);
		
		System.out.println("***********");
		
		List<Integer> sorted=students.stream().map(x->x.getStudentAge()).sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(sorted);
		
		System.out.println("************");
		
		List<Character> remove=students.stream().map(x->x.getStudentSection()).distinct().toList();
		
		System.out.println(remove);
		
		System.out.println("*************");
		
		List<Student> limit=students.stream().limit(2).toList();
		
		System.out.println(limit);
		
		System.out.println("************");
		
		Boolean sec=students.stream().anyMatch(x->x.getStudentSection()=='B');
		
		System.out.println(sec);
		
		System.out.println("************");
		
		Student maxy=students.stream().max(Comparator.comparing(Student::getStudentAge)).get();
		
		System.out.println(maxy);
		
		System.out.println("************");
		
		Student mini=students.stream().min(Comparator.comparing(Student::getStudentAge)).get();
		
		System.out.println(mini);
		
		System.out.println("************");
		
		Integer larg=students.stream().map(x->x.getStudentAge()).distinct().skip(1).findFirst().get();
		
		System.out.println(larg);
		
		System.out.println("************");
		
		Map<String,Student> l1=students.stream().collect(Collectors.toMap(x->x.getStudentName(), y->y));
		
		l1.forEach((x,y)->System.out.println(x+" "+y));
		
		System.out.println("************");
		
		Set<Student> l2=students.stream().collect(Collectors.toSet());
		
		System.out.println(l2);
		
		System.out.println("*************");
		
		List<Student> flat=s.stream().flatMap(f->f.stream()).collect(Collectors.toList());
		
		
		
	}

}
