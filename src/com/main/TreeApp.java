/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

/**
 *
 * @author erkoc
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();
        
        theTree.insert(10);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(40);
        theTree.insert(15);
        
        Node test = theTree.find(15);
        
        if(test != null){
            System.out.println("Your data " + test.data +" found");
        }
        else
            System.out.println("Your data "+ test.data + " not found");
        
        System.out.println("-------Whole Tree--------");
        theTree.traverse();
        System.out.println("--------END--------------");
        Node min = theTree.findMin();
        System.out.println("Minimum value is = " + min.data);
    
        Node max = theTree.findMax();
        System.out.println("Maximum value is = " + max.data);
    }
}
