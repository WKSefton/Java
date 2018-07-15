/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  WordListTester test the WordList class
 */

import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordListTester
{
public static void main(String[] args) throws FileNotFoundException
  {
    //initialize a word list that is empty
    WordList words = new WordList();
    
    //test isEmpty(), true
    System.out.println("The list should be empty\nIs the list empty? " + words.isEmpty());
    
    //test removeWord(), nothing should be removed, false
    System.out.println("\nRemove word Ball: " + words.removeWord("ball"));
    
    //fill the words LinkedList with the file, throw exception
    words = new WordList("wordswithduplicates.txt");

    //test isEmpty(), false
    System.out.println("\nThe list should not be empty\nIs the list empty? " + words.isEmpty());
    
    //size of list
    System.out.println("\nThe size of the list is: " + words.size());
    
    //test toString()
    System.out.println("\n\tTesting toString()");
    System.out.print(words.toString());
    
    //test showWords()
    System.out.println("\n\tTesting showWords()");
    words.showWords();
    
    //user input to add and remove word
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter a word to add to the list:");
    words.addWord(input.next());
    words.showWords();
    System.out.println("Enter a word already on the list:");
    words.addWord(input.next());
    words.showWords();
    input.close();
    
    //test removeWord()
    System.out.println("\n\tTesting removeWord()\nRemove word ball: " + words.removeWord("Ball"));
    System.out.println("Remove word a: " + words.removeWord("a"));
    words.showWords();
    
    //loop to remove all
    while(!words.isEmpty())
    {
      words.remove();
    }
    System.out.println("\nTesting removal loop");
    words.showWords();
    System.out.println("Nothing should be printed above");
  }
}