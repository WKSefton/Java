/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Fraction creates a fraction using a given numerator and denominator
 */
/**
 * simple Fraction class for CSE 271
 * 
 * @author Jill Courte
 */

public class Fraction
{
  private int numerator;
  private int denominator;
  
  public Fraction() 
  {
  }
  
  public Fraction(int num, int denom)  
  {
    this.numerator = num;
    this.denominator = denom;
  }
  
  public double decimal()
  {
    return ((double) this.numerator / (double) this.denominator);
  }
  
  public String toString()
  {
    return this.numerator + "/" + this.denominator;
  }
  
  public boolean equals(Object o)
  {
    if (o == null || ! (o instanceof Fraction))
      return false;
    
    
    if (getClass() != o.getClass())
      
      return false;
    
    Fraction other = (Fraction) o;
    
    return this.numerator == other.numerator && this.denominator == other.denominator;
    
  }
  
  public static void main(String[] args)
  {
    Fraction f1 = new Fraction (1, 2);
    Fraction f2 = new Fraction(1, 3);
    
    System.out.printf("%s equals %s: %b\n", f1, f2, f1.equals(f2));
    
    Fraction f3 = new Fraction (1, 2);
    Fraction f4 = new Fraction(1, 2);
    
    System.out.printf("%s equals %s: %b\n", f3, f4, f1.equals(f4));
    
    Fraction f5 = f4;
    System.out.printf("%s equals %s: %b\n", f5, f4, f5.equals(f4));
    
    Object obj1 = f3;
    Object obj2 = f4;
    
    System.out.printf("%s equals %s: %b\n", obj1, obj2, obj1.equals(obj2));
    
  }
}

/**
1/2 equals 1/3: false
1/2 equals 1/2: true
1/2 equals 1/2: true
1/2 equals 1/2: true
*/