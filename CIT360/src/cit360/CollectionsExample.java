/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.*;
public class CollectionsExample {

    public static void main(String[] args) {
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
        
        /*
            Now let's look at a linked list. According to javatpoint.com,
            ArrayList and List have 4 common differences:
            1. ArrayList is a dynamic array, LinkedList is a doubly linked list
            2. ArrayList is slower because it requires bit shifting
            3. ArrayList can act as a list only, LinkedList can act as a list and a queue
            4. ArrayList is best for storing and accessing data, LinkedList for manipulating data
            The first line creates an empty list
        */
        LinkedList childrenLinkedList = new LinkedList();
        /*
            These next few lines add 5 elements to that list
        */
        childrenLinkedList.add("Sarah");
        childrenLinkedList.add("Zachary");
        childrenLinkedList.add("Trey");
        childrenLinkedList.add("Noelle");
        childrenLinkedList.add("Billie");
        /*
            Output shows just those 5 items.
        */
        System.out.println();
        System.out.println(" LinkedList Elements - Beginning");
        System.out.print("\t" + childrenLinkedList);
        /*
            Now, let's manipulate the list. We left Cobie out, so let's add him
            in his correct spot, between Zachary and Trey.
        */
        childrenLinkedList.add(3,"Cobie");
        /*
            We left Jessica out, so let's add her at the end of the list. Rather
            than having to figure out the number of elements, we can use "addLast"
            to put her at the end of the list.
        */
        childrenLinkedList.addLast("jessica");
        /*
            Similarly, we can add Rilie to the beginning of the list.
        */
        childrenLinkedList.addFirst("Rilie");
        /*
            Oh no! We made left the first letter of Jessica's name lower
            case. Let's remove her and add her back. We can do this with   
            removeLast or removeFirst just like adding.
        */
        childrenLinkedList.removeLast();
        /*
            Now we can add her back.
        */
        childrenLinkedList.addLast("Jessia");
        /*
            We spelled her name wrong again! Let's fix it. We do this with the
            set command, using the index and value we want to replace with.
        */
        childrenLinkedList.set(7, "Jessica");
        /*
            We put two dogs on the list this time. Let's remove them both
        */
        childrenLinkedList.remove("Trey");
        childrenLinkedList.remove(4);
        /*
            Our getters work similarly.
        */
        childrenLinkedList.get(3);
        childrenLinkedList.getFirst();
        childrenLinkedList.getLast();
        /*
            Let's see what we ended up with
        */
        System.out.println();
        System.out.println(" LinkedList Elements - Final");
        System.out.print("\t" + childrenLinkedList);
        childrenLinkedList.clear();
        /*
            And finally, print the empty list
        */
        System.out.println();
        System.out.println(" LinkedList Elements - Empty");
        System.out.print("\t" + childrenLinkedList);
        // HashSet
        Set childrenHashSet = new HashSet(); 
        childrenHashSet.add("Rilie");
        childrenHashSet.add("Sarah");
        childrenHashSet.add("Zachary");
        childrenHashSet.add("Cobie");
        childrenHashSet.add("Billie");
        childrenHashSet.add("Jessica");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + childrenHashSet);

        // HashMap
        Map childrenHashMap = new HashMap(); 
        childrenHashMap.put("Rilie", "21");
        childrenHashMap.put("Sarah", "20");
        childrenHashMap.put("Zachary", "19");
        childrenHashMap.put("Cobie", "18");
        childrenHashMap.put("Billie", "13");
        childrenHashMap.put("Jessica", "11");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + childrenHashMap);
   }
}