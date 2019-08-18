import javax.lang.model.util.ElementScanner6;

class Queue {
    int[] que = new int[10];
    int rear;
    int front;
    int val;

    Queue() {
        rear = -1;
        front = -1;
    }

    void insert(int val) {
        if (rear == 9)
            System.out.println("Queue is full");
        else if (front == -1 && rear == -1) {
            front = rear = que[0];
            que[rear] = val;
        } else {
            que[++rear] = val;
        }
    }

    int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            val = que[front];
            return val;
        }
    }

    int del() {
        if (front == -1 || front > rear) {
            System.out.println("queue is empty");
            return 0;
        } else {
            val = que[front++];
            return val;
        }

    }

}