/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erkoc
 */
public class Tree {

    private Node root;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public Node find(int data) {
        Node current = root;
        while (current.data != data) {
            if (data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    
    public Node findMin(){
        Node current,last;
        last = null;
        current = root;
        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }
    public Node findMax(){
        Node current,last;
        last = null;
        current = root;
        while(current != null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }
}
