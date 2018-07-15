/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 * 
 * Rational class creates objects that can be used as rational fractions
 * and does basic math operations on them.
 * 
 * @author William K. Sefton
 * @version 1.0
 */

public class Rational {
  
  private int n;
  private int d;
  
  /**
   * Default constructor for the Rational class 
   *
   */
  public Rational() 
  {
    this.n = 1;
    this.d = 1;
  }
  
  /**
   * Constructor for Rational class given two integers
   * 
   * @param n
   * the numerator
   * 
   * @param d
   * the denominator
   */
  public Rational(int n, int d)
  {
    if(d == 0) throw new ZeroDenominatorException("Can not have a zero denominator");
    this.n = n;
    this.d = d;
    normalize();
  }
  
  /**
   * Normalizes the fraction by making only the numerator negative
   * and finding the greatest common denominator
   */
  private void normalize() {
    int absNumerator = Math.abs(this.n);
    int absDenominator = Math.abs(this.d);
    int signDenominator = d / absDenominator;
    int divideBy = gcd(absNumerator, absDenominator);
    this.n = (n / divideBy) * signDenominator;
    this.d = (d / divideBy) * signDenominator;
  }
  
  /**
   * Finds the greatest common denominator of two integers
   * 
   * @param a
   * first integer
   * 
   * @param b
   * second integer
   * 
   * @return the greatest common denominator
   */
  private int gcd(int a, int b) 
  {
    int result = 0;
    if (a < b)result = gcd(b, a);
    else if (b == 0)result = a;
    else {
      int remainder = a % b;
      result = gcd(b, remainder);
    }
    return result;
  }
  
  /**
   * shows the value of the numerator
   * 
   * @return the value of the numerator
   */
  public int getNumerator()
  {
    return n;
  }
  
  /**
   * shows the value of the denominator
   * 
   * @return the value of the denominator
   */
  public int getDenominator()
  {
    return d;
  }
  
  /**
   * negates the rational fraction
   * 
   * @return the negated rational fraction
   */
  public void negate()
  {
    Rational negate = new Rational(-n,d);
    System.out.print(negate.toString());
  }
  
  /**
   * finds the reciprocal of a rational fraction
   * 
   * @return the reciprocal of a rational fraction
   */
  public String reciprocal()
  {
    Rational reciprocal = new Rational(d, n);
    return reciprocal.toString();
  }
  
  /**
   * add a rational to another
   * 
   * @param Rational
   * 
   * @return addition of two rational fractions
   */
  public Rational add(Rational other)
  {
    int x = other.getNumerator();
    int y = other.getDenominator();
    Rational result = new Rational((n*y + x*d),(d*y));
    return result;
  }
  
  /**
   * subtract a rational from another
   * 
   * @param Rational
   * 
   * @return subtraction of two rational fractions
   */
  public Rational subtract(Rational other)
  {
    int x = other.getNumerator();
    int y = other.getDenominator();
    Rational result = new Rational((n*y - x*d),(d*y));
    return result;
  }
  
  /**
   * multiply a rational by another
   * 
   * @param Rational
   * 
   * @return multiplcation of two rational fractions
   */
  public Rational multiply(Rational other)
  {
    int x = other.getNumerator();
    int y = other.getDenominator();
    Rational result = new Rational((n*x),(d*y));
    return result;
  }
  
  /**
   * divides a rational by another
   * 
   * @param Rational
   * 
   * @return division of two rational fractions
   */
  public Rational divide(Rational other)
  {
    int x = other.getNumerator();
    int y = other.getDenominator();
    Rational result = new Rational((n*y),(d*x));
    return result;
  }
  
  /**
   * makes the fraction into a string
   * 
   * @return numerator and denominator in a string
   */
  public String toString()
  {
    return n + "/" + d;
  }
  
}
