class CallByRefrence {
    public static void main(String[] args) {
        Test1 test = new Test1();
        int a = 15;
        int b = 20;
        test.method(test);
    }
}