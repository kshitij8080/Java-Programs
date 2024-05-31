class staticc {
    static void add(int a,int b) {
        int c = a+b;
        System.out.println("Addition="+c);
    }
    public static void main(String[] args) {
        add(11,22);
        staticc.add(11,22);
    }
}