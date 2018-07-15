/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  This program determines the zero sum criterion of two arrays. 
 *  The arrays of integers are read from two text files. 
 *    
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ZeroSum
{
  //method returns the integer array and will need to throw an IOException
  public static int[] readFileInt(String fileName) throws FileNotFoundException {
    
    File file = new File(fileName);
    Scanner reader = new Scanner(file);
    int size = reader.nextInt();
    int[] numbers = new int[size];
    
    for(int i = 0; i < size; i++) {
      numbers[i] = reader.nextInt();
    }
    reader.close();
    return numbers;
  }
  //method that displays an array
  public static void displayList(int[] list1, int n) {
    
    if( n > list1.length)
      n = list1.length;
    int[] temp = new int[n];
    
    for(int i = 0; i < n; i++) {
      temp[i] = list1[i];      
    }
    System.out.println("Array generated: " + Arrays.toString(temp));
  }
  //method that determines if there are two numbers in the
  //arrays that add up to zero
  public static boolean isZeroSum(int[] list1, int[] list2) {
    for(int i = 0; i < list1.length; i++) {
      for(int k = 0; k < list1.length; k++) {
        if (list1[i] + list2[k] == 0) {
          return true; 
        }
      }
      
    }
    return false;
  }
  
  public static void main(String[] args) throws FileNotFoundException
  {
    while(true) {
      System.out.println("Enter the name of the first file");
      Scanner input = new Scanner(System.in);
      String fileName = input.next();
      int[] numbs1 = readFileInt(fileName);
      displayList(numbs1, 10);
      System.out.println("Enter the name of the second file");
      fileName = input.next();
      int[] numbs2 = readFileInt(fileName);
      displayList(numbs2, 10);
      boolean zerosum = isZeroSum(numbs1, numbs2);
      System.out.println("It is " + zerosum + " that there is a zero sum between the two arrays.");
    }
  }
}
/**
 Enter the name of the first file 
 nums1.txt
 Array generated: [2, 3, 1, 7, -2]  
 Enter the name of the second file 
 nums2.txt
 Array generated: [2, 3, 1, 7, -9] 
 It is true that there is a zero sum between the two arrays. 
 Enter the name of the first file 
 nums2.txt
 Array generated: [2, 3, 1, 7, -9]  
 Enter the name of the second file 
 nums3.txt
 Array generated: [6, 7, 5, 3, 4]
 It is false that there is a zero sum between the two arrays. 
 Enter the name of the first file 
 */
