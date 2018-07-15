/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 * 
 * PartOfSpeech is a class that can represent a set of words for a single part of
 * speech (i.e., noun, verb, etc.). The set of words is read from a text file, named
 * for the part of speech it contains (i.e., noun.txt, verb.txt, etc.)
 * 
 * @author William K. Sefton
 * @version 1.0
 */

import java.io.*;
import java.util.*;

public class PartOfSpeech {
  
  private String filename;
  private String [] words;
  
  private Random random = new Random();
  
  /**
   * PartOfSpeech constructor
   * 
   * @param filename the name of the file that contains the set of words to be maintained
   */
  
  public PartOfSpeech (String filename)
  {
    this.filename = filename;
    int count = getCount();
    
    this.words = new String[count];
    
    readWordsIntoArray();
  }
  
  /**
   *Opens the file designated by the instance variable filename and counts
   * the number of lines it contains. (Each word is on a seperate line of the file.)
   * the number of words in the file is returned.
   * 
   * @return the number of words in the file
   */
  private int getCount()
  {
    int count = 0;
    Scanner fileIn = null;
    
    try
    {
      fileIn = new Scanner(new FileInputStream(this.filename));     
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
      return 0;
    }
    while(fileIn.hasNextLine())
    {
      count++;
      fileIn.nextLine();
    }
    
    fileIn.close();
    return count;
  }
  
  /**
   * opens the file designted by the instance variable filename and reads them into the
   * instance array words. the instance array must be created before this method is called
   */
  private void readWordsIntoArray ()
  {
    int i = 0;
    Scanner fileIn = null;
    
    try
    {
      fileIn = new Scanner(new FileInputStream(this.filename));
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
      System.exit(0);
    }
    
    while(fileIn.hasNextLine())
    {
      this.words[i++] = fileIn.nextLine(); 
    }
    
    fileIn.close();
  }
  
  /**
   * Debugging method to output the contents of the instance array words to the console
   */
  public void show ()
  {
    for(int i = 0; i < words.length; i++)
      System.out.println(words[i]);
  }
  
  /**
   * Returns a random word from the words array.
   * 
   * @return random word of the current part of speech
   */
  public String getRandomWord()
  {
    int index = this.random.nextInt(this.words.length);
    
    return this.words[index];
  }
  
  /**
   * main method with test code for the class
   * 
   */
  public static void main(String[] args)
  {
    PartOfSpeech nouns = new PartOfSpeech("nouns.txt");
    // nouns.show();
    for (int i = 0; i < 10; i++)
      System.out.println("Random noun is " + nouns.getRandomWord());
    
    PartOfSpeech verbs = new PartOfSpeech("verbs.txt");
    //verbs.show();
    for (int i = 0; i < 10; i++)
      System.out.println("Random verb is " + verbs.getRandomWord());
    
    PartOfSpeech adjectives = new PartOfSpeech("adjectives.txt");
    //adjectives.show();
    for (int i = 0; i < 10; i++)
      System.out.println("Random adjective is " + adjectives.getRandomWord());
  }
  
  /**
   * 
Random noun is trap 
Random noun is cyst 
Random noun is bell 
Random noun is wikipedian 
Random noun is lion 
Random noun is book 
Random noun is toad 
Random noun is cistern 
Random noun is flower 
Random noun is ring 
Random verb is grow 
Random verb is forgets 
Random verb is teaches 
Random verb is eating 
Random verb is kneel 
Random verb is digging 
Random verb is eating 
Random verb is burn 
Random verb is withdraw 
Random verb is spit 
Random adjective is tiny 
Random adjective is angry 
Random adjective is real 
Random adjective is helpless 
Random adjective is wooden 
Random adjective is dead 
Random adjective is cloudy 
Random adjective is slow 
Random adjective is fluttering 
Random adjective is amused 
*/
}