import java.util.Scanner;
import java.io.*;

/**
 * TemperatureConversion provides static methods that allow temperatures to be
 * converted between 4 scales: celsius, fahrenheit, kelvin, rankine.
 * 
 * @author Jill Courte
 * @modified Laurie Werner
 * @version 1.1
 */

//Name: William K. Sefton
//Instructor name: Laurie Werner
//Course number and section: CSE271 Assignment 1 Review
//Description: Modify this program to prompt a user to enter a temperature
//then prompt for a scale to convert it to. Also add option to select file.

public class TemperatureConversion
{
  
  /**
   * Given a double value in fahrenheit and a scale, converts the value to that scale.
   * @param value - the fahrenheit value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   */
  public double fahrenheitToOther (double value, char scale)
  {
    double result = 0.0;
    
    if (scale == 'C')
      result = (value - 32) * 5/9;
    if (scale == 'K')
      result = (value + 459.67)* 5/9;
    if (scale == 'R')
      result = value + 459.67;
    
    return result; 
  }
  
  
  /**
   * Given a double value in celsius and a scale, converts the value to that scale.
   * @param value - the celsius value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   */    
  public double celsiusToOther (double value, char scale)
  {
    double result = 0.0;
    
    if (scale == 'K')
      result = value + 273.15;
    if (scale == 'F')
      result = value * 9/5 + 32;
    if (scale == 'R')
      result = (value + 273.15) * 9/5;
    
    return result; 
  }
  
  
  /**
   * Given a double value in kelvin and a scale, converts the value to that scale.
   * @param value - the kelvin value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   */      
  public double kelvinToOther (double value, char scale)
  {
    double result = 0.0;
    
    if (scale == 'C')
      result = value - 273.15;
    if (scale == 'F')
      result = value * 9/5 - 459.67;
    if (scale == 'R')
      result = value * 9/5;
    
    return result; 
  }
  
  
  /**
   * Given a double value in rankine and a scale, converts the value to that scale.
   * @param value - the rankine value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   */     
  public double rankineToOther (double value, char scale)
  {
    double result = 0.0;
    
    if (scale == 'C')
      result = (value - 491.67) * 5/9;
    if (scale == 'F')
      result = value - 459.67;
    if (scale == 'K')
      result = value * 5/9;
    
    return result; 
  }
  
  /**
   * Given a double value and its associated scale, and a new scale, 
   * converts the given value from the original scale to the new scale.
   * Each scale shoud be one of 'F', 'C', 'K', 'R' (fahrenheit, celsius, kelvin, rankine)
   * @param originalValue - the  value to be converted
   * @param originalScale - the scale of the original value
   * @param newScale - the target scale
   */ 
  public double doConversion (double originalValue, char originalScale, char newScale)
  {
    double newValue = 0.0;
    
    if (originalScale == 'C')
      newValue = celsiusToOther(originalValue, newScale);
    if (originalScale == 'F')
      newValue = fahrenheitToOther(originalValue, newScale);
    if (originalScale == 'K')
      newValue = kelvinToOther(originalValue, newScale);
    if (originalScale == 'R')
      newValue = rankineToOther(originalValue, newScale);
    
    return newValue;
  }
  
  
  
  
  public static void main (String [] args)
  {
    //define variables
    double originalTemp;
    char originalScale;
    char newScale;
    boolean done = false;
    boolean loop = false;
    //create object
    TemperatureConversion temps = new TemperatureConversion();
    Scanner input = new Scanner(System.in);
    while(!done) {
      System.out.println("Press 1 to enter conversions one at a time.");
      System.out.println("Press 2 to enter a file name for batch conversion.");
      System.out.println("Press 3 to quit.");
      int option = input.nextInt();
      if(option == 1) {
        while(!loop){
          try{
            //get user input 
            System.out.println("Please enter the original temperature value and scale 'F', 'C', 'K', 'R' (Fahrenheit, Celsius, Kelvin, Rankine):");
            Scanner in = new Scanner(System.in);
            originalTemp = in.nextDouble();
            originalScale = in.next().charAt(0);
            originalScale = Character.toUpperCase(originalScale);
            System.out.println("Enter the new scale 'F', 'C', 'K', 'R' (Fahrenheit, Celsius, Kelvin, Rankine):");
            newScale = in.next().charAt(0);
            newScale = Character.toUpperCase(newScale);
            
            //temp conversion method
            double result = temps.doConversion(originalTemp, originalScale, newScale);
            
            //print results
            System.out.printf("%.2f %s converts to %.2f %s\n", originalTemp, originalScale, result, newScale);
            
            //see if user wants to continue
            System.out.println("Type Q to quit to main menu, C to continue:");
            if(in.next().equals("Q"))
              loop = true;
            
            //catch errors in the input and try again
          }catch(Exception e) {
            System.out.println("Input error! Please try again."); 
          }
          
        }
      }else if(option == 2){
        System.out.println("Please enter a text file name:");
        String fileName = input.next();
        
        try{
          File file = new File(fileName);
          Scanner read = new Scanner(file);
          
          //check for next line and loop
          while(read.hasNext()) {
            //gather data on each line
            originalTemp = read.nextDouble();
            originalScale = read.next().charAt(0);
            originalScale = Character.toUpperCase(originalScale);
            newScale = read.next().charAt(0);
            newScale = Character.toUpperCase(newScale);
            
            //temp conversion method
            double result = temps.doConversion(originalTemp, originalScale, newScale);
            
            //print results
            System.out.printf("%.2f %s converts to %.2f %s\n", originalTemp, originalScale, result, newScale);
            
          }
          System.out.printf("End of file reached.\n\n");
          
          //error catch
        }catch(Exception e) {
          System.out.printf("\nFile not found!\n\n"); 
        }
      }else if(option == 3){
        System.out.printf("\nGoodbye.\n");
        done = true;
      }else {
        System.out.printf("\nNo options selected.\n\n"); 
      }
      loop = false;
    }
  }
}