public class cmdmaxof3 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
    
        int max, min;
        if(a>=b && a>=c) {
            max = a;
        } else if (b>=a && b>=c) {
            max = b;
        } else {
            max = c;
        }
        if (a<=b && a<=c) {
            min = a;
        } else if (b<=a && b<=c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Maximum number="+max);
        System.out.println("Minimum number="+min);
    }
}