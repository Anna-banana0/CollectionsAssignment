package datastructures.queue;

public class TestQueueD {
    public static void main(String[] args){
    QueueDynamic ll = new QueueDynamic();

    ll.enQ(9);
    ll.enQ(78);
    ll.enQ(21);
    ll.show();

    ll.deQ();
    ll.show();

    ll.enQ(61);
    ll.show();

    }
}
