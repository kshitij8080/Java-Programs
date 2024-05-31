import java.util.*;
public class calcpercentage {
    int rno,m1,m2,m3,m4,m5,m6,total;
    String sname;
    float p;
    void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Roll No:");
        rno=sc.nextInt();
        System.out.println("Enter Student Name:");
        sname=sc.next();
        System.out.println("Enter six subject marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
        sc.close();
    }
    void calc() {
        total=m1+m2+m3+m4+m5+m6;
        p=total/6;
    }
    void display() {
        System.out.println("Student Roll No:"+rno);
        System.out.println("Student Name:"+sname);
        System.out.println("Student Total Marks:"+total);
        System.out.println("Student Percentage:"+p);
    }
    public static void main(String[] args) {
        calcpercentage ob=new calcpercentage();
        ob.accept();
        ob.calc();
        ob.display();
    }
}
