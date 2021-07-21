package datastructures.stack;

public class Stack {

    int data;
    int top=-1;
    int stack[] = new int[10];


    public void push(int data){
        if(top > 9){
            System.out.println("Overflow");
        }
        else{
            top++;
            stack[top] = data;
            System.out.println("Pushed "+data);
        }
    }

    public void pop(){
        if(top < 0){
            System.out.println("Aren't enough elements");
        }
        else{
            System.out.println("Popped "+stack[top]);
            stack[top] = 0;
            top--;
        }
    }

    public void show(){
        for(int i:stack){
            System.out.print(i+" ");
        }
            System.out.println();
    }


}
