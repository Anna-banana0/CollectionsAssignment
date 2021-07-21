package datastructures.queue;

public class QueueStatic {
    // functions: Enqueue, Dequeue, show,
    int queue[];
    int front;
    int rear;
    int size;

    int array_size;

    public QueueStatic(int initialSize) {
        this.array_size = initialSize;
        queue = new int[initialSize];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enQ(int data) throws QueueOverflowException {
        // front remains same, rear increments
        //size++;
        if ((front <= rear) && (rear < array_size)) {
            queue[rear] = data;
            rear++;
            size++;
            System.out.println("enqueued " + data);
        } else if (rear >= array_size) { // beyond the size
            //System.out.println("Overflow");//

            throw new QueueOverflowException("Overflow");
        }

        System.out.println("front= " + front + " rear= " + rear + " Size= " + size);

    }


    public void show() {
        System.out.print("[");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("front= " + front + " rear= " + rear + " Size= " + size);
    }

    public void deQ() {
        // front increment and rear remains same
        if (rear - front == 1) {
            queue[front] = 0;
            front++;
            size--;
            System.out.println("element popped");
            front = 0;
            rear = 0;
        } else if (rear - front > 1 && rear - front <= array_size) {
            queue[front] = 0;
            front++;
            size--;
            System.out.println("element popped");
        } else if (rear - front == 0)
            System.out.println("No elements to pop");

        System.out.println("front= " + front + " rear= " + rear);
    }


}
