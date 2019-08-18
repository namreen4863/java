class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        // function call
        mystack1.push("humaira");
        mystack1.push("zunaira");
        mystack1.push("yusuf");
        mystack1.push("rafiya");
        mystack1.push("farzan");
        // function call
        mystack2.push("farah");
        mystack2.push("prachi");
        mystack2.push("muskaan");
        mystack2.push("esha");
        mystack2.push("nida");

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack2.pop());
        }

    }
}