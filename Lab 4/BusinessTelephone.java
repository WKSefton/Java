public class BusinessTelephone extends Telephone
{
  private String extension;
  BusinessTelephone (String areaCode, String exchange, String number, String extension)
  {
    super(areaCode, exchange, number);
    this.extension = extension;
  }
  public String toString()
  {
   return super.toString(); 
  }
  public void call()
  {
    System.out.println("Calling area code " + super.areaCode);
  }
  public static void main(String[] args)
  {
    BusinessTelephone bt = new BusinessTelephone("513", "785", "3135", "123");
    System.out.println(bt);
    Telephone t1 = new BusinessTelephone("513", "785", "3135", "123");
    System.out.println(t1);
    //this does not work because Telephone is the parent class of BusinessTelephone and not the other way around
    //BusinessTelephone bt2 = new Telephone("785", "3135", "123");
  }
}

/**
 * output before fixing call method
 * Error: areaCode has private access in Telephone
 * 
 * error fixed by making the variable areCode public in the Telephone class
 * 
 * output after fixing call method
 * (513) 785-3135 
 * (513) 785-3135 
 */