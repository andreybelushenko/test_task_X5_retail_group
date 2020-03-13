package main;
public class Main {
     public static void main(String[] args) {
        Tree binaryTree = new Tree();
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(7);
        binaryTree.add(10);
        binaryTree.add(9);
        binaryTree.add(10);
        System.out.println(binaryTree);
        binaryTree.containsNode(8);
        binaryTree.containsNode(11);
        binaryTree.containsNode(4);
        binaryTree.delete(1);
        System.out.println(binaryTree);
    }
}
