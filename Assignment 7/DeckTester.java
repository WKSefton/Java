/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  DeckTest class test all the methods of the Deck class
 */
public class DeckTester { 
  
  public static void main(String[] args)
  {
    //create random 52 card deck
    Deck test = new Deck();
    
    //print out sorted deck
    System.out.println("Original deck\n" + test.toString());
    
    //shuffle cards
    test.shuffleCards();
    
    //print out shuffled deck
    System.out.println("Shuffled deck\n" + test.toString());
    
    //test deckFull method
    System.out.println("Is the deck full? " + test.deckFull());
    //test deckEmpty method
    System.out.println("Is the deck empty? " + test.deckEmpty() + "\n");
    
    //remove one card from the deck
    test.getCard();
    System.out.println("1 card removed from deck\n" + test.toString());
    
    //remove 10 cards from the deck
    for(int i = 0; i < 10; i++)
      test.getCard();
    System.out.println("10 cards removed from deck\n" + test.toString());
    
    //return number of cards dealt from the deck
    System.out.println("\nThere have been: " + test.getCountDealt() + " cards dealt from the deck.");
    
    //remove 41 cards from the deck
    for(int i = 0; i < 41; i++)
      test.getCard();
    System.out.println("41 cards removed from deck\n" + test.toString());
    
    //test deckEmpty method
    System.out.println("Is the deck empty? " + test.deckEmpty());
    //test deckFull method
    System.out.println("Is the deck full? " + test.deckFull() + "\n");
    
    //test restDeck
    test.resetDeck();
    System.out.println("Reset deck to full\n" + test.toString());
    
  } 
}