package main;
public class Node {
   public int value;
    Node left;
    Node right;
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    @Override
    public String toString() {
        String string =
                "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
        return string;
    }
}