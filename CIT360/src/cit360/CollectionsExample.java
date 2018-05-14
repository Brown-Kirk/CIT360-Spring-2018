/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Queue;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {
    public static void main(String args[]) {
        createArrayList();
        createLinkedList();
        createHashSet();
        createHashMap();
        createQueue();
        createTree();
    }
    public static List createArrayList() {
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
        childrenArrayList.add("Zachary");
        childrenArrayList.add("Cobie");
        childrenArrayList.add("Billie");
        childrenArrayList.add("Jessica");
        /*
            This next section outputs a list of the array elements
        */
        System.out.println(" ArrayList  - Beginning");
        System.out.print("\t" + childrenArrayList);
        /*
            Oops! We had Zachary twice. We need to remove the extra.
            Zachary is the 2nd and 3rd element in the array, so we remove index
            2 (0, 1, 2, 3...)
        */
        childrenArrayList.remove(2);
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
        String fourthValue = (String) childrenArrayList.get(3); 
        //Will return the 4th element, "Cobie"
        int zacharyIndex = childrenArrayList.indexOf("Zachary"); 
        /* 
            Will return the index of the value entered. In this case, 2 because 
            "Zachary" is the 3rd element. 
        */
        boolean jessicaContains = childrenArrayList.contains("Jessica");/*
        /*    
            Returns TRUE because the list does contain the value "Jessica"
        */
        System.out.println();
        System.out.println("\t" +" The fourth item is: " + fourthValue);
        System.out.println("\t" +" The index of Zachary is: " + zacharyIndex);
        System.out.println("\t" +" Is Jessica present: " + jessicaContains);
        System.out.print("\t" + childrenArrayList);
        System.out.println();
        System.out.println(" ArrayList Elements - Final");
        System.out.print("\t" + childrenArrayList);
        /*
            Take notice of several things in the list we just printed to the
            screen. First, they are sorted in the order we added them, unless we
            defined their position in the arraylist, then they're in that spot.
            Second, there are duplicates. We entered Zachary twice, so he shows
            up twice in the list. Duplicate values are allowed.
        */
        childrenArrayList.clear();
        /*
            Let's clear the array. We'll not be using it anywhere.
            We can do quite a bit more, but that's a good start!
            Let's print this one more time so we can be sure it is cleared.
        */
        return null;
    }
    public static LinkedList createLinkedList() {
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
        //childrenLinkedList.clear();
        /*
            And finally, print the empty list
        */
        System.out.println();
        System.out.println(" LinkedList Elements - Empty");
        System.out.print("\t" + childrenLinkedList);
        return null;
    }
    
    public static Set createHashSet() {
        /* 
            Now we're going to create a HashSet
            HashSets are similar to ArrayLists and LinkedLists, but not 
            guaranteed to be in any particular order. An item showing up in 
            the HashSet first one time may show up third the next. There is no
            correlation to the position of the item, so you cannot add or 
            remove by position.
        */
        Set childrenHashSet = new HashSet(); 
        /*
            Now, let's add out initial items to the HashSet
        */
        childrenHashSet.add("Rilie");
        childrenHashSet.add("Sarah");
        childrenHashSet.add("Zachary");
        childrenHashSet.add("Zachary");
        childrenHashSet.add("Snoopy");
        childrenHashSet.add("Billie");
        childrenHashSet.add("Jessica");
        /*
            And, of course, print it out to see what we have to start with.
        */
        System.out.println();
        System.out.println(" Set Elements - Initial");
        System.out.print("\t" + childrenHashSet);
        /*
            Notice that the order of items does not necessarily match the
            order it was added, or alphabetical. It is a random order.
            Now we're going to correct a couple of mistakes. Snoopy, again, is
            a pet, not a child, so we'll remove him.
        */
        childrenHashSet.remove("Snoopy");
        /*
            Cobie is going to get mad at us if we keep forgetting him! Let's 
            add him.
        */
        childrenHashSet.add("Cobie");
        System.out.println();
        System.out.println(" Set Elements - Fixed");
        System.out.print("\t" + childrenHashSet);
        /*
            There are far fewer ways to interact with a HashSet, so I'm going
            straight to clearing it. Then let's see a different way to add items
        */
        childrenHashSet.clear();
        /*
            Print it out so we see that it is empty
        */
        System.out.println();
        System.out.println(" Set Elements - Empty");
        System.out.print("\t" + childrenHashSet);
        /*
            We haven't yet discussed it, but we can add an entire collection
            to any of these sets. Let's do that now. We're could add our
            LinkedList from above to this HashSet. This would add all of the
            items at once. However, we have that function returning null, so
            we cannot do this.

            List linkedListForHashSet = linkedListFunction();
            childrenHashSet.addAll(linkedListForHashSet);
            
        And, let's print it out one more time, just to see that it worked.
        */
        return null;
    }
    public static Map createHashMap() {
        /* 
            HashMaps are similar to a two dimensional array. You are associating
            one value directly to one or more other values. Again, Hashes are 
            not saved or accessed in any particular order, so don't expect to 
            recall them by their position.
        */
        Map childrenHashMap = new HashMap(); 
        /*
            Let's add our mappings. In this case, I am correlating my children
            to their age.
        */
        childrenHashMap.put("Rilie", "21");
        childrenHashMap.put("Sarah", "20");
        childrenHashMap.put("Zachary", "19");
        childrenHashMap.put("Zachary", "19");
        childrenHashMap.put("Cobie", "18");
        childrenHashMap.put("Billie", "13");
        childrenHashMap.put("Trey", "8");
        childrenHashMap.put("Jessica", "10");
        /*
            Now we'll print it. Again, notice that the order they are returned
            is not necessarily the order they were added.
        */
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + childrenHashMap);
        /*
            We don't have as many ways to interact with a HashMap, so I'm just 
            going to show you removing and adding. First, Jessica recently had
            a birthday, so we're going to update her age from 10 to 11.
        */
        childrenHashMap.replace("Jessica","11");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + childrenHashMap);
        /*
            Next, we're going to remove Trey again. He really is like a kid to
            us, but, alas, should not be in this list.
        */
        childrenHashMap.remove("Trey");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + childrenHashMap);
        return null;
   }
    public static LinkedList createQueue() {
        /*
            The method for creating a queue is similar to what we've done
            elsewhere. However, we must keep in mind several factors. First,
            we can only add items at the end of the list, we cannot insert them 
            into the middle or end. Second, we can only remove items from the 
            front of the list, not from the middle or end.
        */
        Queue childrenQueue = new LinkedList();
        childrenQueue.add("Rilie");
        childrenQueue.add("Sarah");
        childrenQueue.add("Zachary");
        childrenQueue.add("Cobie");
        childrenQueue.add("Billie");
        childrenQueue.add("Jessica");
        childrenQueue.add("Zachary");
        childrenQueue.add("Trey");
        /*
            Let's look at our queue as it stands.
        */
        System.out.println();
        System.out.println(" Queue Elements - Beginning");
        System.out.print("\t" + childrenQueue);
        /*
            Notice that we have a couple of mistakes here. We have Zachary twice
            and we again have Trey. In order to remove these two items, we would
            either have to clear and recreate the list, or remove the items one
            at a time, then readd the ones we needed. Let's remove one. The 
            remove() method will only return true or false, based upon success 
            of the removal.
        */
        childrenQueue.remove();
        /*
            Again, note that we cannot specify an element. It will only remove 
            the first element. In this case, "Rilie". Another way we could
            remove an item is using the poll() method. Removing in this manner, 
            unlike the remove() method, returns the value that is being removed.
        */
        childrenQueue.poll();
        /*
            If we want to simply retrieve an element, but leave it in place, we
            can use the element() method.
        */
        childrenQueue.element();
        /*
            We could also use the peek() method. It is just like the element() 
            method, except that if the queue is empty, it will return null.
        */
        childrenQueue.peek();
        /*
            Let's see what our list looks like now.
        */
        System.out.println();
        System.out.println(" Queue Elements - Items removed");
        System.out.print("\t" + childrenQueue);
        /*
            Let's clear out our queue and recreate it with the correct values.
        */
        childrenQueue.clear();
        childrenQueue.add("Rilie");
        childrenQueue.add("Sarah");
        childrenQueue.add("Zachary");
        childrenQueue.add("Cobie");
        childrenQueue.add("Billie");
        childrenQueue.add("Jessica");
        /*
            And let's see what it looks like now.
        */
        System.out.println();
        System.out.println(" Queue Elements - Fixed");
        System.out.print("\t" + childrenQueue);
        return null;
    }
    public static TreeSet createTree() {
        /*
            The creation of a treeset is very similar to an array. One major
            difference is that you cannot add or query by index number. The 
            items in a treeset are sorted automatically, so indexes are not 
            used.
        */
        TreeSet childrenTree = new TreeSet();
        childrenTree.add("Rilie");
        childrenTree.add("Sarah");
        childrenTree.add("Zachary");
        childrenTree.add("Cobie");
        childrenTree.add("Billie");
        childrenTree.add("Jessica");
        childrenTree.add("Zachary");
        childrenTree.add("Trey");
        System.out.println();
        System.out.println(" TreeSet Elements - Beginning");
        System.out.print("\t" + childrenTree);
        /*
            We made two mistakes in this treeset. First, we added Zachary twice.
            But, treesets don't allow duplicates, so the second time we added
            him, it overwrote the first. Second, we added Trey, the dog. Let's 
            remove him.
        */
        childrenTree.remove("Trey");
        System.out.println();
        System.out.println(" TreeSet Elements - Fixed");
        System.out.print("\t" + childrenTree);
        /*
            Notice how our list prints out. As stated above, treesets are
            automatically sorted, so no matter the order we add them, they're
            in alphabetical or numerical order. 
            Keep this in mind when creating a treeset. A string treeset 
            containing 11, 12, 110 will be sorted differently than an integer 
            treeset of the same! See the next two treesets
        */
        // String treeset
        TreeSet stringValues = new TreeSet();
        stringValues.add("11");
        stringValues.add("110");
        stringValues.add("12");
        // Integer treeset
        TreeSet integerValues = new TreeSet();
        integerValues.add(11);
        integerValues.add(110);
        integerValues.add(12);
        /*
            Output numeric values from the string treeset. Notice they're not in
            numerical order.
        */
        System.out.println();
        System.out.println(" TreeSet Numeric Elements - String");
        System.out.print("\t" + stringValues);
        /*
            Output numeric values from the integer treeset. Notice that they are
            now in numeric order.
        */
        System.out.println();
        System.out.println(" TreeSet Numeric Elements - Integer");
        System.out.print("\t" + integerValues);
        return null;
    }
}