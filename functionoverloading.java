import java.util.Scanner;
public class functionoverloading {
    int Eid;
	String Ename;
	float salary;
	functionoverloading() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp id:");
		 Eid=sc.nextInt();
		System.out.println("Enter Emp name:");
		 Ename=sc.next();
		System.out.println("Enter Emp salary:");
		 salary=sc.nextFloat();
		 sc.close();
	}
	void display() {
		System.out.println("Employe ID:"+Eid);
		System.out.println("Employe Name:"+Ename);
		System.out.println("Employe Salary:"+salary);
	}
	public static void main(String[] args) {
		functionoverloading ob=new functionoverloading();
		ob.display();
	}
}
