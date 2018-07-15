/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  ListDemo test methods of compairing two List, determining if they are equal
 * and also a method to remove the duplicates from a LinkedList
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class. It is a modification of the
 * program from Chapter 15 section 2 of BJLO
 */
public class ListDemo {
  // using a generic linked list to store word pairs
  // declaring here for testing purposes
  // static LinkedList<WordPair> wpLinkedList = new LinkedList<WordPair>();
  
  /**
   * method to compare two LinkedList of WordPair
   * 
   * @param LinkedList<WordPair> first list
   * @param LinkedList<WordPair> second list
   * 
   * @return boolean true if the same, false if not
   */
  public static boolean isEqual(LinkedList<WordPair> list1, LinkedList<WordPair> list2)
  {
    boolean result = true;
    
    for(WordPair wordPair: list1)
    {
      if(!list2.contains(wordPair))
        result = false;
    }
    for(WordPair wordPair: list2)
    {
      if(!list1.contains(wordPair))
        result = false;
    }
    return result;
  }
  
  /**
   * method to remove the duplicates of a LinkedList of WordPair
   * 
   * @param LinkedList<WordPair> list for duplicates to be removed
   * 
   * @return LinkedList<WordPair> new list with no duplicates
   */
  public static LinkedList<WordPair> removeDuplicate(LinkedList<WordPair> list)
  {
    LinkedList<String> newList = new LinkedList<String>();
    
    for(WordPair words: list)
    {
      if(!newList.contains(words.toString()))
      {
        newList.add(words.toString());
      }
    }
    list.clear();
    for(String words: newList)
    {
      list.add(new WordPair(words));
    }
    return list;
  }
  
  public static void main(String[] args) {
    // using a generic linked list to store word pairs
    // declaring here for testing purposes
    LinkedList<WordPair> wpLinkedList = new LinkedList<WordPair>();
    /*
     * Initialize some word pairs to use in testing
     */
    WordPair pair1 = new WordPair("avec=with");
    WordPair pair2 = new WordPair("moi=I, me");
    WordPair pair3 = new WordPair("si=yes; if; so, such");
    WordPair pair4 = new WordPair("quoi=what");
    WordPair pair5 = new WordPair("devoir=to have to, must; duty, test");
    WordPair pair6 = new WordPair("avec=with");
    WordPair pair7 = new WordPair("oui=yes");
    wpLinkedList.addLast(pair1);
    wpLinkedList.addLast(pair2);
    wpLinkedList.addLast(pair3);
    wpLinkedList.addLast(pair4);
    /*
     * staff.addLast(pair5); staff.addLast(pair6); staff.addLast(pair7);
     * staff.addLast(pair7);
     */
    
    ListIterator<WordPair> iterator = wpLinkedList.listIterator(); // node
    // pointer
    // at front
    iterator.next(); // pair1|pair2,pair3,pair4 (node pointer between pair1
    // and pair2)
    iterator.next(); // pair1,pair2|pair3,pair4 (node pointer between pair2
    // and pair3)
    
    // Add more elements after second element
    
    iterator.add(pair5); // pair1,pair2,pair5|pair3,pair4
    iterator.add(pair6); // pair1,pair2,pair5,pair6|pair3,pair4
    
    iterator.next(); // pair1,pair2,pair5,pair6,pair3| pair4
    
    // Remove last traversed element so pair3 is gone
    
    iterator.remove(); // pair1,pair2,pair5,pair6|pair4
    
    // Print all elements
    
    System.out.println(wpLinkedList.toString());
    System.out.println("\nNow sort the word list");
    Collections.sort(wpLinkedList, new WordPair());
    System.out.println(wpLinkedList.toString());
    System.out.println("\nNow make an ArrayList from the LinkedList");
    ArrayList<WordPair> wpArrayList = new ArrayList<WordPair>(wpLinkedList);
    System.out.println(wpArrayList.toString());
    System.out.println("\nNow add the LinkedList to the ArrayList");
    wpArrayList.addAll(wpLinkedList);
    System.out.println(wpArrayList.toString());
    System.out.println("\nNow sort the ArrayList");
    Collections.sort(wpArrayList, new WordPair());
    System.out.println(wpArrayList.toString());
    
    // add code to remove duplicated from the LinkedList wpLinkedList
    System.out.println("\nNow remove duplicates from the LinkedList");
    wpLinkedList = removeDuplicate(wpLinkedList);
    System.out.println(wpLinkedList.toString());
    
    // now add code (can be a method) to determine if two link lists are the
    // same
    
    //create new LinkedList and compair it to another
    LinkedList<WordPair> wpLinkedList2 = new LinkedList<WordPair>();
    wpLinkedList2.addAll(wpLinkedList);
    System.out.println("\nTesting isEqual method");
    System.out.println(isEqual(wpLinkedList, wpLinkedList2)); //true
    wpLinkedList2.add(new WordPair("Test=This")); //add another WordPair to make different
    System.out.println(isEqual(wpLinkedList, wpLinkedList2)); //false
    
  }
}

/**
 [avec=with, moi=I, me, devoir=to have to, must; duty, test, avec=with, quoi=what] 

Now sort the word list 
[avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what] 

Now make an ArrayList from the LinkedList 
[avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what] 

Now add the LinkedList to the ArrayList 
[avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what, avec=with, avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what] 

Now sort the ArrayList 
[avec=with, avec=with, avec=with, avec=with, devoir=to have to, must; duty, test, devoir=to have to, must; duty, test, moi=I, me, moi=I, me, quoi=what, quoi=what] 

Now remove duplicates from the LinkedList 
[avec=with, devoir=to have to, must; duty, test, moi=I, me, quoi=what] 

Testing isEqual method 
true 
false 
*/
