/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.TreeSet;

/**
 *
 * @author reddo
 */
public class treeSetExample {
    public static void main(String args[]) {

        createTree();
    }
        public static TreeSet createTree() {
        TreeSet childrenTree = new TreeSet();
        childrenTree.add("Rilie");
        childrenTree.add("Sarah");
        childrenTree.add("Zachary");
        childrenTree.add("Cobie");
        childrenTree.add("Billie");
        childrenTree.add("Jessica");
        System.out.println(childrenTree);
        return null;
    }
}
