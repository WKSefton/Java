
/*
 * @author wernerla
 * @ William K. Sefton
 * @ CSE271
 * @Date 2/27/18
 * 
 * Blue Robot Child Class
 * 
 * The blue robots understand verbs and adverbs and 
 * produce one of the following types of phrases
 * 
 * verb + adverb
 * verb + adverb + and + adverb
 * 
 * */

public class BlueRobot extends Robot {
  public BlueRobot(String name) {
    super(name);
  }
  
  // build a Blue robot phrase
  public String getPhrase() {
    String phrase = null;
    String type1 = null;
    String type2 = null;
    // two
    int randomType = super.number.nextInt(2); // number is protected so
    // accessible here
    if (randomType == 0) // verb + adverb
    {
      type1 = vocab.getRandomVerb();
      type2 = vocab.getRandomAdverb();
    } else if (randomType == 1)// verb + adverb + and + adverb
    {
      type1 = vocab.getRandomVerb() + " " + vocab.getRandomAdverb();
      type2 = vocab.getRandomAdverb();
    }
    
    if (randomType == 0) // verb + adverb
    {
      phrase = type1 + " " + type2;
    } else if(randomType == 1) {
      phrase = type1 + " and " + type2;
    }
    
    return phrase;
  }
  
  /*
   * Main method for testing
   */
  public static void main(String[] args) {
    Robot blue = new BlueRobot("Blue");
    System.out.println("***Testing getName and getPhrase");
    System.out.println(blue.getName());
    System.out.println(blue.getPhrase());
    System.out.println("***Testing with 5 random blue robots, using toString");
    for (int i = 0; i < 5; i++) {
      System.out.println(blue.toString());
      
    }
  }
}

/**
 * ***Testing getName and getPhrase 
Blue 
pay arbitrarily 
***Testing with 5 random blue robots, using toString 
Blue says rends faithfully and sheepishly 
Blue says blowing speedily and pointlessly 
Blue says bellowing publicly 
Blue says dive mercilessly 
Blue says lying turbulently 
*/