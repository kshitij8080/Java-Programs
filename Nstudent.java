import java.util.Scanner;
public class Nstudent {
    int rno;
    String name;
    float per;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll number:");
        rno = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Student Name:");
        name = sc.nextLine();
        System.out.println("Enter percentage:");
        per = sc.nextFloat();
    }

    void sort_by_per(Nstudent ob[], int n) {
        int i, pass;
        Nstudent temp;
        for (pass = 1; pass < n; pass++) {
            for (i = 0; i < n - pass; i++) {
                if (ob[i].per < ob[i + 1].per) {
                    temp = ob[i];
                    ob[i] = ob[i + 1];
                    ob[i + 1] = temp;
                }
            }
        }

        for (i = 0; i < n; i++) {
            System.out.println(ob[i].rno + "\t" + ob[i].name + "\t" + ob[i].per);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        Nstudent ob[] = new Nstudent[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new Nstudent();
            ob[i].accept();
        }
        sc.close();

        ob[0].sort_by_per(ob, n);
    }
}
