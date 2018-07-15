/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  This program tests the class HeartRate
 *    
 */

public class HeartRateTester
{

public static void main(String[] args)
  {
    HeartRate test = new HeartRate("William", "Sefton", 10, 3, 1990);
    System.out.println("***Testing constructors and toString methods***");
    System.out.println(test.toString());
    System.out.println("\n***Testing getter methods***");
    System.out.println(test.getFirstName() + " " + test.getLastName() + " DOB:" + test.getMonth() + "/" + test.getDay() + "/" +test.getYear());
    System.out.println("Patient age: " + test.getAge() + " Current Year: " + (test.getAge() + test.getYear()));
    System.out.println("\n***Testing setter methods***");
    test.setFirstName("Tim");
    test.setLastName("Kenneth");
    test.setYear(1965);
    test.setMonth(4);
    test.setDay(19);
    System.out.println("Changed name to Tim Kenneth, born 19/4/1965");
    System.out.println("\n***Testing setter methods***");
    System.out.println(test.getFirstName() + " " + test.getLastName() + " DOB:" + test.getMonth() + "/" + test.getDay() + "/" +test.getYear());
    System.out.println("Patient age: " + test.getAge() + " Current Year: " + (test.getAge() + test.getYear()));
    System.out.println("\n***Testing Max and target heart rate methods***");
    System.out.println(test.toString());
    System.out.println("Maximum patient heart rate: " + test.maxHeartRate());
    System.out.println(test.targetHeartRate());   
  }
}