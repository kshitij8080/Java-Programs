class Student {
  int rno;
  String name;
  static int cnt=0;
  Student() {
    rno=1;
    name="kshitij";
  }
  Student(int rno,String name) {
    cnt++;
    this.rno=rno;
    this.name=name;
  }
  public String toString() {
    return "\n object count:"+cnt+"\n Roll no:"+rno+"\n name:"+name;
  }
  public static void main(String[] args) {
    Student ob=new Student(11,"om");
    System.out.println(ob);
    Student ob1=new Student(12,"sai");
    System.out.println(ob1);
    Student ob2=new Student(13,"ram");
    System.out.println(ob2);
  }
}
