public class Telephone
{
  public String areaCode;
  private String exchange;
  private String number;
  Telephone (String areaCode, String exchange, String number)
  {
    this.areaCode = areaCode;
    this.exchange = exchange;
    this.number = number;
  }
  public String toString ()
{
    return String.format("(%s) %s-%s", this.areaCode, this.exchange, this.number);
}
  public static void main(String[] args)
  {
    Telephone t = new Telephone("123", "345", "1234");
    System.out.println(t);
  }
}

/**
 * Here is the output from overriding the toString() method in the Telephone class
 * (123) 345-1234 
 */