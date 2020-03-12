package main;
//
public class Main {
     public static void main(String[] args) {
        Tree BinaryTree = new Tree();
        BinaryTree.add(8);
        BinaryTree.add(3);
        BinaryTree.add(1);
        BinaryTree.add(6);
        BinaryTree.add(4);
        BinaryTree.add(7);
        BinaryTree.add(10);
         BinaryTree.add(9);
         BinaryTree.add(10);
        System.out.println(BinaryTree);
         BinaryTree.containsNode(8);
         BinaryTree.containsNode(11);
         BinaryTree.containsNode(4);
    }
}
