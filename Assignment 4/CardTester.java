//Name: William K. Sefton
//Instructor name: Laurie Werner
//Course number and section: CSE271 Assignment 4
//Description: Testing the Card class and its implementation of the CardInterface

import java.util.*;
public class CardTester
{
  public static void main(String[] args)
  {
    //testing constructors
    Card test = new Card();
    System.out.println("*****Default constructor produces*****\n" + test.toString());
    //testing for out of bounds
    Card test2 = new Card(5,5);
    System.out.println("*****Out of bounds suite produces*****\n" + test2.toString());
    Card test3 = new Card(3,15);
    System.out.println("*****Out of bounds rank produces*****\n" + test3.toString());
    
    
    ArrayList<Card> cards = new ArrayList<Card>();
    //generate random suit and ranks and palce into ArrayList
    for (int i = 0; i < 5; i++)
    {
      Random rand = new Random();
      int suit = rand.nextInt((5 - 1) + 1) + 1;
      //System.out.println(suit);
      int rank = rand.nextInt((14 - 2) + 1) + 2;
      //System.out.println(rank);
      
      
      cards.add(new Card(suit, rank));
    }
    System.out.println("*****Drawing 5 cards to test*****");
    //Print out all CardInterface objects in the ArrayList cards
    int i = 1;
    for(CardInterface obj : cards)
    { 
      
      System.out.println("Card " + i + " is: " + obj.getRankAsString() + 
                         " of " + obj.getSuitAsString());
      System.out.println(obj.toString());
      System.out.println("\t**********");
      i++;
    }
    
    //Testing sameSuit
    Card same1 = new Card(4,10);
    Card same2 = new Card(1, 3);
    //Testing Setters
    same1.setSuit(3);
    same2.setSuit(3);
    System.out.println("*****Testing to see if same suit*****");
    System.out.println("Card one is: " + same1.getRankAsString() + 
                       " of " + same1.getSuitAsString());
    System.out.println(same1.toString());
    System.out.println("Card two is: " + same2.getRankAsString() + 
                       " of " + same2.getSuitAsString());
    System.out.println(same2.toString());
    System.out.println("Result: " + same1.sameSuit(same2));
    System.out.println("\t**********");
    
    //Testing compareTo
    //Testing Setters
    same1.setRank(3);
    same2.setRank(14);
    System.out.println("*****Testing to see rank difference*****");
    System.out.println("Card one is: " + same1.getRankAsString() + 
                       " of " + same1.getSuitAsString());
    System.out.println(same1.toString());
    System.out.println("Card two is: " + same2.getRankAsString() + 
                       " of " + same2.getSuitAsString());
    System.out.println(same2.toString());
    System.out.println("Result: " + same1.compareTo(same2));
    System.out.println("\t**********");
    
  }
}

/**
 *****Default constructor produces*****
Rank: 2
Suit: 1 
*****Out of bounds suite produces*****
Rank: 5
Suit: 1 
*****Out of bounds rank produces*****
Rank: 2
Suit: 3 
*****Drawing 5 cards to test***** 
Card 1 is: Ten of Hearts 
Rank: 10
Suit: 2 
 ********** 
Card 2 is: Jack of Spades 
Rank: 11
Suit: 1 
 ********** 
Card 3 is: Four of Spades 
Rank: 4
Suit: 1 
 ********** 
Card 4 is: Two of Diamonds 
Rank: 2
Suit: 3 
 ********** 
Card 5 is: Six of Spades 
Rank: 6
Suit: 1 
 ********** 
*****Testing to see if same suit***** 
Card one is: Ten of Diamonds 
Rank: 10
Suit: 3 
Card two is: Three of Diamonds 
Rank: 3
Suit: 3 
Result: true 
 ********** 
*****Testing to see rank difference***** 
Card one is: Three of Diamonds 
Rank: 3
Suit: 3 
Card two is: Ace of Diamonds 
Rank: 14
Suit: 3 
Result: 11 
 ********** 
 */
