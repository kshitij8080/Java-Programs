import java.util.*;
public class employee {
    int emp_id;
    String name;
    float emp_salary;

    void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employe id:");
        emp_id=sc.nextInt();
        System.out.println("Enter Employe name:");
        name=sc.next();
        System.out.println("Enter Employe salary:");
        emp_salary=sc.nextInt();
        sc.close();
    }
    void display() {
        System.out.println("Employee id="+emp_id);
        System.out.println("Employee name="+name);
        System.out.println("Employee salary="+emp_salary);
    }
    public static void main(String[] args) {
        employee ob=new employee();
        ob.accept();
        ob.display();
    }
}