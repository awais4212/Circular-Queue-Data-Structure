class queue1 {
    int front;
    int rear;
    int[] arr;
    int capacity;

    public queue1(int size) {
        capacity = size;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    void Enqueue(int data) {
        if (front == (rear + 1) % capacity) {
            System.out.println("Stack is Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            System.out.println(" Element is added: " + data);
            arr[++rear] = data;
            return;
        }
        rear = ((rear + 1) % capacity);
        System.out.println(data + " element added in the Queue");
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Underflow");
            return -1;
        }
        int item = arr[front];
        if (rear == front) {
            front = -1;
            rear = -1;
        }
        else {
            front = (front + 1) % capacity;
        }
        return item;

    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements:");
        int i = front;

        while (true) {
            System.out.println(arr[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % capacity;
        }
    }
}



public class Cricular_Queue {
    public static void main(String[] args) {

        queue1 q = new queue1(3);

        q.Enqueue(10);
        q.Enqueue(14);
        q.Enqueue(20);
        q.display();
        q.dequeue();
        q.display();

    }
}
