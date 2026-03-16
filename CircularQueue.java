public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

   
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public CircularQueue() {
        this(10);
    }

    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Customer " + value + " joined the counter queue.");
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int served = queue[front];
        System.out.println("Checkout Counter Serving: " + served);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return served;
    }

    public int peek() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}