/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Deck class creates a deck of cards and
 * has public methods to shuffle the deck
 * reset it, return the number of cards dealt
 * take one card from the top of the deck
 * and return booleans if the deck is empty
 * or full
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card
{
  private ArrayList<Card> deck;
  private int CARDS_DEALT = 0;
  private int SIZE_OF_DECK = 52;
  
  
  /**
   * Default constructor. Initializes a deck of cards.
   */
  public Deck()
  {
    deck = createDeck();
  }
  
  /**
   * method that creates an arraylist of Card objects
   */
  private ArrayList<Card> createDeck()
  {
    ArrayList d = new ArrayList<Card>(SIZE_OF_DECK);
    for(int i = 1; i <= 4; i++)
    {
      for(int k = 2; k <= 14; k++)
      {
        d.add(new Card(i,k)); 
      }
    }
    return d;
  }
  
  /**
   * method to swap cards in the deck with one another
   * 
   * @param int card to be swapped
   * @param int card to be swapped
   */
  private void swapCards(int i, int k)
  {
    if(i != k)
    {
      Card tempi = deck.get(i);
      deck.set(i, deck.get(k));
      deck.set(k, tempi);
    }
  }
  
  /**
   * method to shuffle the deck of cards
   * 
   * randomly swaps two cards in the deck using
   * the swapCards method a random number
   * of times between 500 and 1000
   */
  public void shuffleCards()
  {
    Random rand = new Random();
    int value = rand.nextInt(1000) + 500;
    while(value > 0)
    {
      swapCards(rand.nextInt(51) , rand.nextInt(51));
      value--;
    }
  }
  
  /**
   * method to return boolean value of the deck being
   * full
   * 
   * @return boolean true if full false if not full
   */
  public boolean deckFull()
  {
    return this.deck.size() == SIZE_OF_DECK;
  }
  
  /**
   * method to return boolean value of the deck being
   * empty
   * 
   * @return boolean true if empty false if not empty
   */
  public boolean deckEmpty()
  {
    return this.deck.isEmpty();
  }
  
  /**
   * method to remove the top card on the deck and
   * add one to the CARDS_DEALT count
   */
  public void getCard()
  {
    if(CARDS_DEALT < SIZE_OF_DECK)
    {
    deck.remove(0);
    CARDS_DEALT++;
    }
  }
  
  /**
   * method to return the number of cards
   * dealt from the deck
   * 
   * @return int number of cards dealt
   */
  public int getCountDealt()
  {
    return CARDS_DEALT;
  }
  
  /**
   * method to reset the deck to its full
   * unique set of cards
   */
  public void resetDeck()
  {
    deck = createDeck(); 
    CARDS_DEALT = 0;
  }
  
  /**
   *@override method toString()
   * 
   * @return String status of each card
   * in the deck
   */
  public String toString()
  {
    String string = "";
    for(int i = 0; i < deck.size(); i++)
    {
      string += "Card "+ (i+1) + ":\t" + deck.get(i).toString() + "\n";
    }
    return "\tTop of deck\n" + string + "\tBottom of deck\n";
  }
}