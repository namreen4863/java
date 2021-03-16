class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 15;
        int b = 20;
        System.out.println("VALUE OF A AND B IS BEFORE " + a + " " + b);
        test.meth(a, b);
        System.out.println("VALUE OF A AND B IS AFTER " + a + " " + b);
    }
}