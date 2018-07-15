/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  WordList takes a file of words, removes duplicates
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;

public class WordList extends LinkedList<String>
{
  
  /**
   * default constructor creates empty LinkedList<String>
   */
  public WordList()
  {
  }
  
  /**
   * creates a LinkedList of words from a file
   * 
   * @param String file name
   */
  public WordList(String fileName) throws FileNotFoundException
  {
    File file = null;
    Scanner read = null;
    try{
      file = new File(fileName);
      read = new Scanner(file);
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
    
    while(read.hasNext())
    {
      String word = read.next();
      addWord(word);
    }
    read.close();
  }
  
  /**
   * adds a word to the LinkedList
   * will not add a duplicate word
   * 
   * @param String word to be added
   */
  public void addWord(String word)
  {
    if(!this.contains(word))
      this.add(word);
  }
  
  /**
   * removes a word from the LinkedList
   * returns boolean if removed
   * 
   * @param String word to be removed
   * @return boolean true if removed, false if not removed
   */
  public boolean removeWord(String word)
  {
    if(this.contains(word))
    {
      this.remove(word);
      return true;
    }
    else
    {
      return false; 
    }
  }
  
  /**
   * prints all words in the LinkedList
   * in rows of 5
   */
  public void showWords()
  {
    ListIterator<String> iterator = this.listIterator();
    while(iterator.hasNext())
    {
      for(int i = 0; i < 5; i++)
      {
        if(iterator.hasNext())
          System.out.print(iterator.next() + "\t");
      }
      System.out.println();
    }
  }
  
  /**
   * @overide
   * overides toString() prints all words in the lsit
   */
  public String toString()
  {
    String toString = "";
    for(String word: (LinkedList<String>)this)
    {
      toString += word + "\n"; 
    }
    return toString;
  }
}