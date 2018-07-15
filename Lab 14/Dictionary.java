
/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Dictionary class is a LinkedList of WordPair
 * objects and has methods to sort those objects
 * using the comparator class and comparable class
 */

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary extends WordPair
{
  //LinkedList of WordPair objects
  private LinkedList<WordPair> wordList = new LinkedList<WordPair>();
  
  /**
   * adds a WordPair to the LinkedList
   * 
   * @param WordPair of words to be added
   */
  public void addWordPair(WordPair words)
  {
    wordList.add(words);    
  }
  
  /**
   * removes a WordPair from the LinkedList
   * 
   * @param WordPair words to be removed
   */
  public void removeWordPair(WordPair words)
  {
    wordList.remove(words); 
  }
  
  /**
   * returns a boolean if the LinkedList
   * is empty or not
   * 
   * @return boolean true if empty, false if not
   */
  public boolean isEmpty()
  {
    return wordList.isEmpty(); 
  }
  
  /**
   * method to sort the LinkedList of WordPair
   * objects using the Collections.sort method
   * and the Comparator interface
   * 
   * I used an anonamous class to define the Comparator
   * and overide the compare method
   */
  public void sortByFirstWord()
  {
    Collections.sort(wordList, new Comparator<WordPair>(){
      public int compare(WordPair aWord, WordPair bWord) 
      {
        return aWord.getWordA().compareTo(bWord.getWordA());
      }
    });
  }
  
  /**
   * method to show all the WordPair
   * in the LinkedList
   */
  public void show()
  {
    for(WordPair words: wordList)
    {
      System.out.println(words); 
    }
  }
  
  //testing main method
  public static void main(String[] args) throws FileNotFoundException
  {
    //new Dictionary object
    Dictionary test = new Dictionary();
    
    //add some WordPair objects, out of alphabetical order
// test.addWordPair(new WordPair("g=h"));
// test.addWordPair(new WordPair("c=d"));
// test.addWordPair(new WordPair("a=b"));
// test.addWordPair(new WordPair("e=f"));
    
    //add words from Scanner and file
    String fileName = "EsperantoDictionary2.txt";
    Scanner read = null;
    File file = null;
    try
    {
      file = new File(fileName);
      read = new Scanner(file);
      
      while(read.hasNext())
      {
        String line = read.nextLine();
        test.addWordPair(new WordPair(line));
      }
      
      //sort words using comparator
      test.sortByFirstWord();
      
      //show the LinkedList of WordPair objects
      test.show();
      
      read.close();
    }catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
  }
}