/***  NegativeArgumentException - a runtime exception that signals there was an
  * 
  *  attempt to construct an object with a negative value.
  *
  *  @author wernerla
  *  @version 4.0
  */
public class NegativeArgumentException extends RuntimeException 
{
  public NegativeArgumentException(String reason) 
  {
    super(reason);
  }
}