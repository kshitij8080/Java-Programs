import java.util.*;
abstract class staff {
  int id;
  String name;
  staff(int  id,String name) {
    this.id=id;
    this.name=name;
  }
}
class officestaff extends staff {
  String dept;
  officestaff(int id,String name,String dept) {
    super(id,name);
    this.dept=dept;
  }
  void disp() {
    System.out.println("Staff id:"+id);
    System.out.println("Staff name:"+name);
    System.out.println("Staff department:"+dept);
  }
}
class MD {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    officestaff ob[]=new officestaff[n];
      for(int i=0;i<n;i++) {
        System.out.println("Enter Staff ID:");
        int id=sc.nextInt();
        System.out.println("Enter Staff Name:");
        String name=sc.next();
        System.out.println("Enter Staff Department:");
        String dept=sc.next();
        ob[i]=new officestaff(id,name,dept);
      }
      System.out.println("\n");
      for(int i=0;i<n;i++) {
        ob[i].disp();
      }
  }
}
