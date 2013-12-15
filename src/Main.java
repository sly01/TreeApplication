/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erkoc
 */
public class Main {
    public static void main(String[] args) {
        
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        
        Node key = tree.find(35);
        if (key != null) {
            System.out.println("Your key is found :)");
        }
        else
            System.out.println("Your key is not found in the tree. :(");
        
        System.out.println("Minimum value of tree is "+tree.findMin().data);
        
        System.out.println("Maximum value of tree is "+tree.findMax().data);
    }
}
