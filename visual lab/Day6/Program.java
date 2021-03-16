class Program {

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        A ref;
        ref = objA;
        ref.Person();

        ref = objB;
        ref.Person();

        ref = objC;
        ref.Person();
    }
}