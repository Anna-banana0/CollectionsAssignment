package datastructures.trees;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc =  new Scanner(System.in);

    public BinaryNode createBinaryTree(){
        BinaryNode root;
        System.out.println("Enter data ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new BinaryNode(data);

        System.out.println("enter for left of "+data);
        root.left = createBinaryTree();

        System.out.println("Enter for right of "+data);
        root.right = createBinaryTree();

        return root;

    }
}
