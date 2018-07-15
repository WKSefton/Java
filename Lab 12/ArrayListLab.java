/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  ArrayListLab creates and fills two ArrayList of different
 * data types and prints their contents
 */

/* Consider the following loop for collecting all elements that match a condition;
 * 
 *  in this case, that the element is larger than 100.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListLab
{
  public static void main(String[] args)
  {
    ArrayList<Double> matches = new ArrayList<Double>();
    double element = 0;
    int elementInt = 0;
    for (int i = 0; i < 20; i++)
    {
      /**  Add code here to generate a random number named element between 50 and 150
        * 
        */
      element = (Math.random() * 150) + 50;
      if (element > 100){matches.add(element);
      }
    }
    /**  Add code here to display the ArrayList matches, its size, and then add the number 99
      * 
      *  to the end of matches.
      *
      *  Then display the last item in matches
      */
    for(double number : matches)
    {
      System.out.println(number); 
    }
    System.out.println("ArrayList size: " + matches.size());
    matches.add(99.0);
    System.out.println(matches.get(matches.size()-1));
    
    ArrayList<Integer> matchesInt = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++)
    {
      /**  Add code here to generate a random number named elementInt between 1 and 150
        * 
        */
      elementInt = (int)((Math.random() * 150) + 50);
      if (elementInt > 75){matchesInt.add(elementInt);
      }
    }
    /**  Add code here to display the ArrayList matchesInt, its size, and then add the number 200
      * 
      *  to the end of matchesInt
      *
      *  Then display the last item in matches.
      */
    for(int number : matchesInt)
    {
      System.out.println(number); 
    }
    System.out.println("ArrayList size: " + matchesInt.size());
    matchesInt.add(200);
    System.out.println(matchesInt.get(matchesInt.size()-1));
  }
}

/**
145.24580582275934 
181.34970169496705 
131.81103134741323 
116.10297168753952 
140.0521623112997 
155.95693901718346 
175.33950399695453 
180.2946934158638 
149.89607393841487 
192.2068653438627 
151.16129064477605 
131.78637318693774 
186.63468157659494 
ArrayList size: 13 
99.0 
172 
131 
139 
103 
108 
137 
82 
122 
91 
178 
117 
128 
140 
136 
181 
77 
172 
140 
ArrayList size: 18 
200 
*/