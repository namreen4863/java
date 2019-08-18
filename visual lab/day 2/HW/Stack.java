class Stack {
    String stck[] = new String[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(String item) {
        if (tos == 9)
            System.out.println("Stack is full");
        else {
            stck[++tos] = item;
        }
    }

    String pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return " ";
        } else
            return stck[tos--];
    }

}