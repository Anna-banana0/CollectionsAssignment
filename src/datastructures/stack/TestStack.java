package datastructures.stack;

public class TestStack {
    public static void main(String[] args){

        Stack pile = new Stack();

        pile.push(10);
        pile.push(9);
        pile.push(39);
        pile.push(20);
        pile.push(54);

        pile.show();

        pile.pop();
        pile.show();


    }
}
