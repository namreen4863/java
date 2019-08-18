class TestQueue {
    public static void main(String[] args) {
        Queue myque = new Queue();
        int i;
        for (i = 1; i < 10; i++) {
            myque.insert(i);
        }
        System.out.println("first element of queue is");
        System.out.println(myque.peek());
        System.out.println("elements to be deleted are ");

        for (i = 1; i < 10; i++) {
            System.out.println(myque.del());
        }

    }
}