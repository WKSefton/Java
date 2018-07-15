import java.util.*;
public class AnimalRunner
{  
  public static void main(String[] args)   
  {     
    ArrayList<Speakable> speakList = new ArrayList<Speakable>();  
    speakList.add(new Dog("Fred")); 
    speakList.add(new Cat("Wanda"));  
    for (Speakable obj : speakList)   
    {    
      obj.speak();     
    } 
  }
}
/**
 * Woof! Woof!
 * Meow! Meow!
 */