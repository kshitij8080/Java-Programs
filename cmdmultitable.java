public class cmdmultitable {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Multiplication Table Of"+a);
        for (int i=1;i<=10;i++) {
            System.out.println(i*a);
        }
    }
}

