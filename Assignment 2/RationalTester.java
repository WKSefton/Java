/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 * 
 * RationalTester is a program that takes user input to test
 * the Rational class
 * 
 * @author William K. Sefton
 * @version 1.0
 */

import java.util.Scanner;

public class RationalTester 
{
  
  public static void main(String[] args) 
  {
    int a, b, c, d;
    Scanner in = new Scanner(System.in);
    while(true) {
      
      System.out.println("Please enter the first numerator:");
      a = in.nextInt();
      System.out.println("Please enter the first denominator:");
      b = in.nextInt();
      System.out.println("Please enter the second numerator:");
      c = in.nextInt();
      System.out.println("Please enter the second denominator:");
      d = in.nextInt();
      
      //two test fractions
      Rational test = new Rational();
      Rational test2 = new Rational();
      
      try{
        test = new Rational(a,b);
        test2 = new Rational(c,d);
      }catch(Exception e) {
        System.out.println(e.getMessage()); 
      }
      //test .getNumerator and .getDenominator methods
      System.out.println("The first numerator is:\t" + test.getNumerator());
      System.out.println("The first denominator is:\t" + test.getDenominator());
      System.out.println("The second numerator is:\t" + test2.getNumerator());
      System.out.println("The second denominator is:\t" + test2.getDenominator());
      //test .toString() method
      System.out.println("The first fraction is:\t" + test.toString());
      System.out.println("The second fraction is:\t" + test.toString());
      //test .reciprocal() method
      System.out.println("The reciprocal of the first fraction is: \n\t" + test.reciprocal());
      System.out.println("The reciprocal of the second fraction is: \n\t" + test2.reciprocal());
      //test addition and subtraction methods
      System.out.println("The first fraction plus the second fraction is:");
      System.out.println(" \t" + test.toString() + " + " + test2.toString() + " = " + test.add(test2).toString());
      System.out.println("The first fraction minus the second fraction is:");
      System.out.println("\t" + test.toString() + " - " + test2.toString() + " = " + test.subtract(test2).toString());
      //test division and multiplication methods
      System.out.println("The first fraction divided by the second fraction is:");
      System.out.println("\t" + test.toString() + " / " + test2.toString() + " = " + test.divide(test2).toString());
      System.out.println("The the first fraction times the second fraction is:");
      System.out.println("\t" + test.toString() + " * " + test2.toString() + " = " + test.multiply(test2).toString());
      System.out.println("Q to quit, anything else to continue.");
      if(in.next().equals("Q")){
        in.close();
        return;
      }
    }
  }
}