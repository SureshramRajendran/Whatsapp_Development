package Preparation;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[]args) {
		
		Employee emp1=new Employee("Ram",1153,35000,"SE","Chennai");
		Employee emp2=new Employee("Raj",1089,75000,"ME","Chidambaram");
		Employee emp3=new Employee("Ram",1153,35000,"SE","Chennai");
		Employee emp4=new Employee("Ramji",1105,65000,"AE","Bangalore");
		Employee emp5=new Employee("Rocky",1159,70000,"FE","Cuddalore");
		
		HashMap<Integer, Employee> emps=new HashMap<>(25);
		emps.put(emp1.getEmpId(), emp1);
		emps.put(emp2.getEmpId(), emp2);
		emps.put(emp3.getEmpId(), emp3);
		emps.put(emp4.getEmpId(), emp4);
		emps.put(emp5.getEmpId(), emp5);
		
		System.out.println(emps.get(emp1.getEmpId()).hashCode());
		System.out.println(emps.get(emp3.getEmpId()).hashCode());
		emps.forEach((x,y)->System.out.println(x.hashCode()+","+y));
		System.out.println(emp1.equals(emp3));

	}

}
