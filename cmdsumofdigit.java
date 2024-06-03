public class cmdsumofdigit {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int s=0,d;
        while(n>0) {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum of dogit:"+s);
    }
}
