package datastructures.queue;


public class TestQueue {
    public static void main(String[] args){

        QueueStatic line = new QueueStatic(6);
        try {

            line.enQ(10);
            line.enQ(7);
            line.enQ(45);
            line.show();
            line.deQ();
            line.deQ();
            line.deQ();
            line.deQ();
            line.show();
            line.enQ(2);
            line.enQ(9);
            line.enQ(44);
            line.enQ(90);
            line.enQ(19);
            line.enQ(75);
            line.enQ(43);
        }catch (QueueOverflowException e){
            e.printStackTrace();
        }




    }

}