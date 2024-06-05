import java.util.*;
class employee {
  Scanner sc=new Scanner(System.in);
  int id,sal;
  String name,dept;
  employee() {
    id=101;
    name="om";
    dept="science";
    sal=40000;
  }
  employee(int id,String name,String dept,int sal) {
    this.id=id;
    this.name=name;
    this.dept=name;
    this.sal=sal;
  }
  void accept() {
    System.out.println("Enter ID Name Department Salary:");
    id=sc.nextInt();
    name=sc.next();
    dept=sc.next();
    sal=sc.nextInt();
  }
  void disp() {
    System.out.println("Employee id:"+id);
    System.out.println("Employee Name:"+name);
    System.out.println("Employee Department:"+dept);
    System.out.println("Employee Salary:"+sal);
  }
}
class manager extends employee {
  int bonous;
  manager() {
    bonous=3000;
  }
  manager(int bonous) {
    this.bonous=bonous;
  }
  void acceptm() {
    System.out.println("Enter Bonous:");
    bonous=sc.nextInt();
  }
  void dispm() {
    System.out.println("Employee Bonous:"+bonous);
  }
}
class MD {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    manager ob[]=new manager[n];
    for(int i=0;i<n;i++) {
      ob[i]=new manager();
      ob[i].accept();
      ob[i].disp();
      System.out.println("\n");
    }
    int max=ob[0].sal+ob[0].bonous;
    int index=0;
    for(int i=1;i<n;i++) {
      if((ob[i].sal+ob[i].bonous)>max) {
        max=ob[i].sal+ob[i].bonous;
        index=1;
      }
    }
    System.out.println("\n");
    ob[index].disp();
    ob[index].dispm();
  }
}
