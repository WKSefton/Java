//Name: William K. Sefton
//Instructor name: Laurie Werner
//Course number and section: CSE271 Final Part 1
//Description: BingoGame plays a game of bingo using the
//BingoCard and BingoBag classes 

import java.util.ArrayList;
import java.util.Scanner;

public class BingoGame 
{
  //array list to hold the players bingo cards
  private ArrayList<BingoCard> players = new ArrayList<BingoCard>();
  //bingo bag to draw bingo balls from
  private BingoBag bingoBag = new BingoBag();
  private static Scanner in;
  
     /**
  * default constructor for the bingo game
  * option in code to draw one ball at a time.
  */
  public BingoGame()
  {
    System.out.println("This program takes a number of bingo players and draws bingo balls\n automatically until there is a winner. There is an option to draw a card after pressing a key");
                       
    setPlayers();
    printBoard();
    while(!draw())
    {
      printBoard();
            
      //uncomment this method to draw one ball at 
      // a time
      //cont();
    }
    
  }
  
     /**
  * method to slow the game down if desired 
  * requires a key press to continue
  */
  public void cont()
  {
    System.out.println("Press any key to draw another card.");
   in.next(); 
  }
  
   /**
  * sets the number of players for the game
  */
  public void setPlayers()
  {
    in  = new Scanner(System.in);
    int number = 0;
    
    System.out.println("Enter number of players: ");
    number = in.nextInt();
    
    
    for(int i = 0; i < number; i++)
    {
      try{
        players.add(new BingoCard());
      }catch(Exception e)
      {
        System.out.println(e.getMessage()); 
      }
    }
  }
  
     /**
  * prints all of the players bingo cards
  */
  public void printBoard()
  {
    int i = 1;
    for(BingoCard player: players)
    {
      System.out.println("Player " + i + "\n" + player.show());
      i++;
    }
  }
  
     /**
  * draws a card from the bingo bag
  * 
  * @return boolean true if someone has bingo, false if not
  */
  public boolean draw()
  {
    int i = 1;
    //draw a ball from the bag
    BingoBall ball = bingoBag.draw();
    System.out.println("Bingo Ball: " + ball.getColumn() + "-" + ball.getValue() + " Drawn.");
    
    //mark all players cards with the ball
    for(BingoCard player: players)
    {
      if(player.mark(ball))
      {
        
        player.mark(ball);
        System.out.println("Player " + i + " has the draw ball!");
        
        //check if bingo
        if(player.isBingo())
        {
          System.out.println("\nBingo! The winner is Player " + i + "!");
          System.out.println(player.show());
          return true; 
        }
      }else
      {
        System.out.println("Player " + i + " does not have " + ball.getColumn() + "-" + ball.getValue());
      }
      i++;
    }
    System.out.println();
    return false;
  }
  
  //main method to start the game
  public static void main(String[] args)
  {
    BingoGame run = new BingoGame();
  }
}