package main;
//


public class Tree {
    Node root;
    public void add(int value) {
        root = addRecursive(root, value);

    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            System.out.println(value + "Addded to the tree");
            return new Node(value);
        }
        if (value == current.value) {
            System.out.println(value + " value is already exists");
            return current;    //value already exists
        }
        else if  (value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        else  {    // (value > current.value)
            current.right = addRecursive(current.right, value);
        }

        return current;
    }


    public boolean containsNode(int value) {
         boolean containsNodeFlag;
          containsNodeFlag= containsNodeRecursive(root, value);
          if (containsNodeFlag) {
              System.out.println("Tree contains " + value);
          }
          else {
              System.out.println("Tree NOT contains " + value);
          }
        return containsNodeFlag;
    }

    private boolean containsNodeRecursive(Node current, int value) {
                ///
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;    //value already exists
        }
        else if  (value < current.value) {
            return  containsNodeRecursive(current.left, value);

        }
        else  {    // (value > current.value)
            return containsNodeRecursive(current.right, value);
        }
    }

    //delete
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }


    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            // У Ноды нет потомков, случай 1
            if (current.left == null && current.right == null) {
                return null;
            }

            //У Ноды есть один (правый или левый потомок, случай 2)
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }







    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
