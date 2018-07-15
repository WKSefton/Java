/**
 * BingoCaller acts as a caller for the BingoGame class
 * it draws random BingoBalls
 */

import java.util.Random;

public class BingoCaller
{
  private char column;
  private int value;
  private BingoBall bingoBall;
  
  public BingoCaller()
  {
    
  }
  
  /*
   * @return BingoBall random bingo ball generated
   */
  public BingoBall drawBall()
  {
    //generate random int between 1 and 75
    Random rand = new Random();
    value = rand.nextInt(74) + 1;
    
    //determin column
    if(value < 16)
    {
      column = 'B';
    }else if(value < 31 && value > 15)
    {
      column = 'I';
    }else if(value < 46  && value > 30)
    {
      column = 'N'; 
    }else if(value < 61  && value > 45)
    {
      column = 'G'; 
    }else if(value < 76  && value > 60)
    {
      column = 'O'; 
    }
    
    //create bingo ball
    try{
      bingoBall = new BingoBall(column,value);
    }catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
    
    return bingoBall;
  }
  
  /*
   * @return int of bingo ball
   */
  public int getValue()
  {
    return bingoBall.getValue();
  }
  
  /*
   * @return char of bingo ball
   */
  public char getColumn()
  {
    return bingoBall.getColumn();
  }
  
  /*
   * @overide toString method
   */
  public String toString()
  {
    return bingoBall.toString();
  }
  
  
  //test main method
  public static void main(String[] args)
  {
    BingoCaller test = new BingoCaller();
    
    //make some bingo balls
    for(int i = 0; i < 5; i++)
    {
      System.out.println(test.drawBall().toString());
    }
    
    //test getters
    System.out.println(test.getColumn() + "-" + test.getValue());
    
  }
}