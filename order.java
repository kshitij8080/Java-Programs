import java.util.*;
abstract class order {
    int id;
    String description;
    abstract void accept();
    abstract void disp();
    Scanner sc=new Scanner(System.in);
}
class placeorder extends order {
    String cname;
    void accept() {
      System.out.println("Enter order id:");
      id=sc.nextInt();
      System.out.println("Enter description:");
      description=sc.next();
      System.out.println("Enter customer name:");
      cname=sc.next();
    }
    void disp() {
        System.out.println("order id:"+id);
        System.out.println("order description:"+description);
        System.out.println("customer name:"+cname);
    }
}
class salesorder extends order {
    String vendor;
    void accept() {
        System.out.println("Enter order id:");
        id=sc.nextInt();
        System.out.println("Enter description:");
        description=sc.next();
        System.out.println("vendor name:");
        vendor=sc.next();
    }
    void disp() {
        System.out.println("order id:"+id);
        System.out.println("order description:"+description);
        System.out.println("vendor:"+vendor);
    }
}
class MD {
    public static void main(String[] args) {
        placeorder ob=new placeorder();
        placeorder ob1=new placeorder();
        placeorder ob2=new placeorder();
        
        ob.accept();
        ob1.accept();
        ob2.accept();
        ob.disp();
        ob1.disp();
        ob2.disp();
        
        salesorder ob3=new salesorder();
        salesorder ob4=new salesorder();
        salesorder ob5=new salesorder();
        
        ob3.accept();
        ob4.accept();
        ob5.accept();
        ob3.disp();
        ob4.disp();
        ob5.disp();
    }
}
