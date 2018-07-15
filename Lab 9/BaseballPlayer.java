/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  BaseballPlayer represents a baseball player by name, strike outs, and batting average.
 */
public class BaseballPlayer
{
  private String name;
  private int strikeOuts;
  private int battingAvg;
  
  /**
   * Constructor for objects of class BaseballPlayer
   */
  public BaseballPlayer()
  {
  }
  
  /**
   * Overloaded constructor for BaseballPlayer
   * 
   * @param String name of player
   * @param int number of strikeouts
   * @param int batting average
   */
  public BaseballPlayer(String name, int strikeOuts, int battingAvg) 
  {
    setName(name);
    setStrikeOuts(strikeOuts);
    setBattingAvg(battingAvg);
  }
  
  /**
   * setter method for name
   * 
   * @param String name of player
   */
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  
  /**
   * mutator method for strike outs
   * 
   * @param int number of strike outs
   */
  public void setStrikeOuts(int strikeOuts) throws InvalidStrikeOut
  {
    if(strikeOuts < 0)
      throw new InvalidStrikeOut();
    
    this.strikeOuts = strikeOuts;
  }
  
  /**
   * mutator method for batting average
   * 
   * @param int batting average
   */
  public void setBattingAvg(int battingAvg) throws InvalidBattingAverage
  {
    if(battingAvg < 0 || battingAvg > 1000)
      throw new InvalidBattingAverage();
    
    this.battingAvg = battingAvg;
  }
  
  /**
   * @override toString()
   */
  public String toString() 
  {
    return (name + " SO="+strikeOuts + " BA="+battingAvg);
  }
  
  
  public static void main(String[] args) 
  {
    //create object
    BaseballPlayer test = new BaseballPlayer();
    
    //test setName
    System.out.println("Setting player name to Will Sef");
    test.setName("Will Sef");
    
    
    //test strikeouts error
    System.out.println("Setting player Strike Outs to -1");  
    try{
      test.setStrikeOuts(-1);
    }catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
    
    //test batting average bellow zero error
    System.out.println("Setting player Batting Average to -1");  
    try{
      test.setBattingAvg(-1);
    }catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
    
    //test batting average above 1000 error 
    System.out.println("Setting player Strike Outs to 3");  
    System.out.println("Setting player Batting Average to 2000");  
    try{
      test.setStrikeOuts(3);
      test.setBattingAvg(2000);
    }catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
    
    //give regular results
    System.out.println("Setting player Batting Average to 500"); 
    try{
      test.setStrikeOuts(5);
      test.setBattingAvg(500);
    }catch(Exception e)
    {
      System.out.println(e.getMessage()); 
    }
    
    //test toString
    System.out.println("Baseball player: " + test.toString());
  }
}

/**
 Setting player name to Will Sef 
 Setting player Strike Outs to -1 
 Invalid number of Strike Outs! 
 Setting player Batting Average to -1 
 Invalid number for Batting Average! 
 Setting player Strike Outs to 3 
 Setting player Batting Average to 2000 
 Invalid number for Batting Average! 
 Setting player Batting Average to 500 
 Baseball player: Will Sef SO=5 BA=500 
 */