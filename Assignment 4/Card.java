//Name: William K. Sefton
//Instructor name: Laurie Werner
//Course number and section: CSE271 Assignment 4
//Description: The Card class implementing the CardInterface

public class Card implements CardInterface
{
  
  private int suit;
  private int rank;
  
  public Card()
  {
    this.suit = 1;
    this.rank = 2;
  }
  
  public Card(int suit, int rank)
  {
    setSuit(suit);
    setRank(rank);    
  }
  
  /**
   * Returns the face value of the card, where the cards' values are specified
   * in a set of constants.
   * 
   * @return integer value of the rank.
   */
  public int getRank()
  {
    return this.rank;
  }
  
  /**
   * Returns the suit value of the card, where the suits' values are specified
   * in a set of constants.
   * 
   * @return integer value of the suit - 1, 2, 3, 4.
   */
  public int getSuit()
  {
    return this.suit; 
  }
  
  /**
   * Sets the rank of the card, a number from 2 to 14,
   * representing the face value of a numeric card, or 11
   * for Jack, 12 for Queen, 13 for King and 14 for Ace
   * 
   * @param rank
   *            the rank to set
   *            if rank is not valid, rank is set to 2.
   */
  public void setRank(int rank)
  {
    if(rank > 1 && rank < 15)
    {
      this.rank = rank;
    }else
    {
      this.rank = 2; 
    }
  }
  
  /**
   * sets the suit of the card, a number from 1 to 4, 
   * representing spades, hearts, clubs, diamonds respectively.
   * @param suit
   *           the suit to set
   *           if suit is not valid, suit is set to spades (1)
   */
  public void setSuit (int suit)
  {
        if(suit > 0 && suit < 5)
    {
      this.suit = suit;
    }else
    {
      this.suit = 1;
    }
  }

  /**
   * Compares suit of two cards
   * 
   * @param other
   *            - Card to compare to
   * @return true if other.suit == this.suit
   */
  public boolean sameSuit(Card other)
  {
    if(other.suit == this.suit)
      return true;
    return false;
  }
  
  /**
   * Compares the rank of 2 cards;
   * 
   * @param other
   *            - other Card
   * @return difference in rank as this.rank-other.rank; returns
   *         Integer.MAX_VALUE if other is null.
   */
  public int compareTo(Card other)
  {
    return Math.abs(this.rank - other.rank);
  }
  
  /**
   * Returns a String representation of the card's face value. "Two", "Three",
   * ... "Ten", "Jack", "Queen", "King", "Ace".
   * 
   * @return String representation of face value.
   */
  public String getRankAsString()
  {
    switch(this.rank)
    {
      case 2: return "Two";
      case 3: return "Three";
      case 4: return "Four";
      case 5: return "Five";
      case 6: return "Six";
      case 7: return "Seven";
      case 8: return "Eight";
      case 9: return "Nine";
      case 10: return "Ten";
      case 11: return "Jack";
      case 12: return "Queen";
      case 13: return "King";
      case 14: return "Ace";
    }
    return "";
  }
  
//
  /**
   * Returns a String representation of the card's suit vaue."Spades",
   * "Hearts","Diamonds","Clubs"
   * @return String representation of Suit value.
   */
  public String getSuitAsString()
  {
    switch(this.suit)
    {
      case 1: return "Spades";
      case 2: return "Hearts";
      case 3: return "Diamonds";
      case 4: return "Clubs";
    }
    return "";
  }
  
  @Override
  /**
   * Returns a string indicating suit and rank as raw integers
   * @return string representation of numeric suit and rank
   */
    public String toString()
  {
   return "Rank: " + this.rank +
     "\nSuit: " + this.suit;
      
  }
  
}