//Name: William K. Sefton
//Instructor name: Laurie Werner
//Course number and section: CSE271 Final Part 1
//Description: BingoBag stores a set of BingoBall objects
//and has a method to draw one of the remaining balls at
//random

import java.util.ArrayList;
import java.util.Random;

public class BingoBag
{
  private ArrayList<BingoBall> bingoBag = new ArrayList<BingoBall>();
  private char[] column = {'B','I','N','G','O'};
  
  public BingoBag()
  {
    BingoBall ball;
    int i = 1;
    for(int k = 0; k < 5; k++)
    {
      for(int j = 0; j < 15; j ++)
      {
        try{
          ball = new BingoBall(column[k],i);
          bingoBag.add(ball);
        }catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
        
        i++;
      }
    }
  }
  
  public BingoBall draw()
  {
    
    if(!getBingoBag().isEmpty())
    {
      //arraylist of balls left
      ArrayList<BingoBall> notCalled = getBingoBag();
      
      //random number of index in list of uncalled balls
      Random rand = new Random();
      int value = rand.nextInt(notCalled.size());
      
      BingoBall bingoBall = notCalled.get(value);
      
      //change marked to true in bingo bag
      bingoBag.get(bingoBag.indexOf(bingoBall)).setMarked(true);
      return bingoBall;
    }else{
      System.out.println("There are no more balls to draw!");
      return null; 
    }
    
    
  }
  
  public ArrayList<BingoBall> getBingoBag()
  {
    //array list of all the balls remaining
    ArrayList<BingoBall> temp = new ArrayList<BingoBall>();
    for(BingoBall ball: bingoBag)
    {
      if(!ball.getMarked())
      {
        temp.add(ball);
      }
    }
    return temp;
  }
  
  public ArrayList<BingoBall> getCalled()
  {
    //array list fo all the balls called
    ArrayList<BingoBall> temp = new ArrayList<BingoBall>();
    for(BingoBall ball: bingoBag)
    {
      if(ball.getMarked())
      {
        temp.add(ball);
      }
    }
    return temp;
  }
  
  public String toString()
  {
    return bingoBag.toString(); 
  }
  
  
  public static void main(String[] args)
  {
    BingoBag test = new BingoBag();
    
    //testing toString
    System.out.println("-----Original Bingo Balls----");
    System.out.println(test.toString());
    System.out.println("Bingo Balls in bag: " + test.getBingoBag().size());
    
    //draw 80 balls, expeting 5 error messages
    int ballsToDraw = 80;
    System.out.println("----------Drawing " + ballsToDraw +" balls----------");
    for(int i = 0; i < ballsToDraw; i++)
      test.draw();
    
    //print called balls, marked true
    System.out.println("-----Bingo Balls Drawn-----");
    System.out.println(test.getCalled().toString());
    System.out.println("Bingo Balls in bag: " + test.getCalled().size());
    
    //print balls remaining, marked false
    System.out.println("-----Bingo Balls Remaining-----");
    System.out.println(test.getBingoBag().toString());
    System.out.println("Bingo Balls in bag: " + test.getBingoBag().size());
  }
}
