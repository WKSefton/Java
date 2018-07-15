/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  This class takes the name and DOB of a patient and calculates
 * their maximum heart rate and their target heart rate range
 *    
 */

public class HeartRate {
  
  private String firstName, lastName;
  private int age, day, month, year, currentYear = 2018;
  
  /**
   * constructor for the HeartRate class
   * 
   * @param string of first name
   * @param string of last name
   * @param day of month born as int
   * @param month of year born as int
   * @param year born as int
   * 
   */
  public HeartRate(String firstName, String lastName, int day, int month, int year)
  {
    setFirstName(firstName);
    setLastName(lastName);
    setDay(day);
    setMonth(month);
    setYear(year);
  }
  /**
   * sets the patients first name
   * 
   * @param the patients first name as a string
   */
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  /**
   * gets the patients first name
   * 
   * @return the patients first name as a string
   */
  public String getFirstName()
  {
    return this.firstName;
  }
  /**
   * sets the patients last name
   * 
   * @param the patients last name as a string
   */
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  /**
   * gets the patients last name
   * 
   * @return the patients last name as a string
   */
  public String getLastName()
  {
    return this.lastName;
  }
  /**
   * sets the day of the month the patient was born on
   * 
   * @param day of the month the patient was born
   */
  public void setDay(int day)
  {
    this.day = day;
  }
  /**
   * patients birth day of the month
   * 
   * @return day of the month patient was born as integer
   */
  public int getDay()
  {
    return this.day;
  }
  /**
   * sets the month the patient was born
   * 
   * @param integer month of patients birth
   */
  public void setMonth(int month)
  {
    this.month = month;
  }
  /**
   * calculates the age of the patient
   * 
   * @return the patients age
   */
  public int getMonth()
  {
    return this.month;
  }
  public void setYear(int year)
  {
    this.year = year;
  }
  
  public int getYear()
  {
    return this.year;
  }
  /**
   * calculates the age of the patient
   * 
   * @return the patients age
   */
  public int getAge()
  {
    this.age = currentYear - year;
    return age;
  }
  
  /**
   * calculates the maximum heart rate based on age
   * 
   * @return the max heart rate as an integer
   */
  public int maxHeartRate()
  {
    return 220 - this.age; 
  }
  
  /**
   * calculates the target heart rate based on age
   * 
   * @return the target heart rate as a string
   */
  public String targetHeartRate()
  {
    return "The target heart rate range is between: " + Math.round(maxHeartRate()*.5) + " and " + Math.round(maxHeartRate()*.85);
  }
  
  /**
   * displays the patient data
   * 
   * @return the patients data as a string
   */
  public String toString()
  {
    return "HeartRate[Name=" + getFirstName() + " " + getLastName() + "][DOB:" + getMonth() + "/" + getDay() + "/" + getYear() + "][Current Year:" + this.currentYear + "]";
  }
  
}