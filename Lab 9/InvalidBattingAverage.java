/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Throws InvalidBattingAverage error, extends RuntimeException
 */
public class InvalidBattingAverage extends RuntimeException
{
  public String getMessage()
  {
    return "Invalid number for Batting Average!";
  }
}