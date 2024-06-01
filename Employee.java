import java.util.*;
public class Employee {
	static int cnt=0;
	
	int id;
	String name,dept;
	float sal;
	Employee() {
		cnt++;
		id=1;
		name="sai";
		dept="computer";
		sal=900000;
	}
	Employee(int id,String name,String dept,float sal) {
		cnt++;
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	void display() {
		System.out.println("\n Object Count:"+cnt);
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee department:"+dept);
		System.out.println("Employee salary:"+sal);
	}
	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.display();
		Employee ob1=new Employee(101,"om","science",54000);
		ob1.display();
		Employee ob2=new Employee(102,"sai","commerce",45000);
		ob2.display();
	}
}
