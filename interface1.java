import java.util.*;
class college{
	int cno;
	String cname;
	String caddr;
	Scanner sc=new Scanner(System.in);
	void acceptc() {
		System.out.println("Enter College no:");
		cno = sc.nextInt();
		System.out.println("Enter College name:");
		cname = sc.next();
		System.out.println("Enter College Address:");
		caddr = sc.next();
	}
	void dispc() {
		System.out.println("College no:"+cno);
		System.out.println("College name:"+cname);
		System.out.println("College Address:"+caddr);
	}
}
class student extends college {
	int rno;
	String sname;
	float per;
	void accept() {
		System.out.println("Enter Student rno:");
		rno = sc.nextInt();
		System.out.println("Enter Student name:");
		sname = sc.next();
		System.out.println("Enter percentage:");
		per = sc.nextFloat();
	}
	void disp() {
		System.out.println("College no:"+rno);
		System.out.println("College name:"+sname);
		System.out.println("College Address:"+per+"\n");
	}
}
 class teacher extends college {
	 int tno;
	 String tname;
	 float sal;
	 void accept() {
			System.out.println("Enter Teacher no:");
			tno = sc.nextInt();
			System.out.println("Enter Teacher name:");
			tname = sc.next();
			System.out.println("Enter Salary:");
			sal = sc.nextFloat();
		}
		void disp() {
			System.out.println("Teacher no:"+tno);
			System.out.println("Teacher name:"+tname);
			System.out.println("Salary:"+sal);
		}
 }
 class interface1 {
	 public static void main(String[] args) {
		 student ob=new student();
		 ob.acceptc();
		 ob.accept();
		 ob.dispc();
		 ob.disp();
		 teacher ob1=new teacher();
		 ob1.acceptc();
		 ob1.accept();
		 ob1.dispc();
		 ob1.disp();
	 }
 }
