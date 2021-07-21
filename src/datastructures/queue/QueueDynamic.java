package datastructures.queue;

public class QueueDynamic {
    Node front,rear;
    int size;

    QueueDynamic(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enQ(int data){
        size++;
        Node node = new Node();
        node.data = data;

        if(front == null){ // 1st element
            front = node;
            rear = node;
        }
        else{ // other elements
            rear.next = node;
            rear = node;
        }
        System.out.println("Enqueued "+data);
    }

    public void deQ(){

        size--;
        if(front == null){ // 1st element
            System.out.println("Not enough elements");
        }
        else{ // jump the front by next
            front = front.next;
            System.out.println("element dequeued");
        }
    }

    public void show(){
        System.out.print("Elements in the queue are :");
        Node temp = new Node();
        temp = front;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("total elements "+size);
    }
}
