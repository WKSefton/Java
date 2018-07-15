/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  Recursion class
 */

public class Recursion
{
  
  /**
   * recursivly prints a number vertically
   * 
   * @param int number to be printed
   */
  public static void writeVertical (int n)
  {
    if(n > 0)
    {
      writeVertical(n/10);
    }
    else
    {
      return;
    }
    System.out.println(n%10);
  }
  
  /**
   * prints an int vertically, non recursive
   * 
   * @param int number to be printed
   */
  public static void nonRecursiveWriteVertical(int n)
  {
    int i = 0;
    int temp = n;
    while(temp > 0)
    {
      temp = temp/10;
      i++;
    }
    for(; i > 0; i--)
    {
      System.out.println(n%(int)Math.pow(10,i)/(int)Math.pow(10,i-1));
    }
  }
  
  /**
   * recursivly computes the power of a number
   * 
   * @param double base number
   * @param double power number
   * 
   * @return double base to the power number
   */
  public static double power (double x, double n)
  {
    if (n < 0)
    {
      return 1/power(x, -n);
    }    
    else if (n > 0)
    {
      return x*power(x, n-1);
    }
    return 1;
  }
  
  /**
   * non recursivly computes the power
   * of a number to another number
   * 
   * @param int base number
   * @param int power number
   * 
   * @return int base number to the power
   */
  public static int nonRecursivePower(int x, int n)
  {
    int result = x;
    if (n == 0)
    {
      return 1; 
    }
    for (int i = 1; i < n; i++)
    {
      result = result*x;
    }
    return result;
  }
  
    /**
   * computes the sum of the digits of
   * a number
   * 
   * @param int number
   * 
   * @return int sum of digits
   */
  public static int sumDigits(int n)
  {
    int result = 0;
    if(n < 10)
    {
    }
    else
    {
      result = sumDigits(n/10);
    }
    result += n%10;
    return result;
  }
  
  /**
   * recursivly computes the factorial
   * of an integer
   * 
   * @param int number
   * 
   * @return int factorial of number
   */
  public static int factorial(int n)
  {
    int result = n;
    if(n > 0)
    {
      return result = result*factorial(n-1); 
    }
    else
    {
      return 1;
    }
  }
  
  public static void main(String args[])
  {
    //testing power method for recursion
    System.out.println("Testing recursive power method");
    System.out.println(String.format("%f", power(12, -2)));
    
    //power method done without recursion
    System.out.println("Testing non recursive power method");
    System.out.println(nonRecursivePower(12, 2));
    
    //test recursive writeVertical
    System.out.println("Testing recursive writeVertical method");
    writeVertical(1234);
    
    //test nonRecursiveWriteVertical
    System.out.println("Testing non recursive writeVertical method");
    nonRecursiveWriteVertical(120349907);
    
    //test sumDigits method
    System.out.println("Testing recursive sumDigit method");
    System.out.println(sumDigits(10982));
    
    //test factorial method
    System.out.println("Testing recursive factorial method");
    System.out.println(factorial(10));
  }
}

/**
Testing recursive power method 
0.006944 
Testing non recursive power method 
144 
Testing recursive writeVertical method 
1 
2 
3 
4 
Testing non recursive writeVertical method 
1 
2 
0 
3 
4 
9 
9 
0 
7 
Testing recursive sumDigit method 
20 
Testing recursive factorial method 
3628800
*/