package BinarySearchTree;

public class BinarySearchTree {
    Node root;
    class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int data) {
        Node nd = new Node(data);
        if(root == null) {
            root = nd;
            return true;
        }
        Node temp = root;
        while(true) {
            if(temp.value == nd.value) {
                return false;
            }
            if(temp.value > nd.value) {
                if(temp.left == null) {
                    temp.left = nd;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = nd;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int data) {
        Node temp = root;
        while(temp != null) {
            if(temp.value > data) {
                temp = temp.left;
            } else if(temp.value < data) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
