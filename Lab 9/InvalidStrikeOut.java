/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Throws InvalidStrikeOut error, extends RuntimeException
 */
public class InvalidStrikeOut extends RuntimeException
{
  public String getMessage()
  {
    return "Invalid number of Strike Outs!";
  }
}