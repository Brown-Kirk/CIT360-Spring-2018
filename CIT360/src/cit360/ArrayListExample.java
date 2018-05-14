/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.*;

/**
 *
 * @author reddo
 */
public class ArrayListExample {
    
    public static void main(String args[]) {
    /* 
            There are a number of Collection classes. In this example, I 
            demonstrate 4 of these: ArrayList, LinkedList, HashSet, and
            HashMap.
            This first class creates an array list called childrenArrayList.
        */
        List childrenArrayList = new ArrayList();
        /*
            These next 6 lines add each of my children's names as an element
            of that array
        */
        childrenArrayList.add("Sara");
        childrenArrayList.add("Zachary");
        childrenArrayList.add("Cobie");
        childrenArrayList.add("Trey");
        childrenArrayList.add("Billie");
        childrenArrayList.add("Jessica");
        /*
            This next section outputs a list of the array elements
        */
        System.out.println(" ArrayList  - Beginning");
        System.out.print("\t" + childrenArrayList);
        /*
            Oops! We included the dog's name, "Trey". We need to remove it!
            "Trey" is the 4th element in the array, so we remove item 3
            (0, 1, 2, 3...)
        */
        childrenArrayList.remove(3);
        /*
            Well, crap. We created this in order of birth, but left out the
            oldest, "Rilie". Let's add her in the proper location.
        */
        childrenArrayList.add(0,"Rilie");
        /*
            Now, we need to correct the spelling of Sarah's name.
            Remember, we inserted "Rilie" at position 0, so "Sara" is now at
            position 1.
        */
        childrenArrayList.set(1,"Sarah");
        /*
            Here are a few more things we can do
        */
        childrenArrayList.get(3); //Will return the 4th element, "Cobie"
        childrenArrayList.indexOf("Zachary"); /* Will return the index of the
            value entered. In this case, 2 because "Zachary" is th3 3rd 
            element. 
        */
        childrenArrayList.contains("Jessica");/*
        /*    
            Returns TRUE because the list does contain the value "Jessica"
        */
        System.out.println();
        System.out.println(" ArrayList Elements - Final");
        System.out.print("\t" + childrenArrayList);
        childrenArrayList.clear();//Removes all values from the array.
        /*
            We can do quite a bit more, but that's a good start!
            Let's print this one more time so we can be sure it is cleared.
        */
        System.out.println();
        System.out.println(" ArrayList Elements - Empty");
        System.out.print("\t" + childrenArrayList);
    }
}
    
