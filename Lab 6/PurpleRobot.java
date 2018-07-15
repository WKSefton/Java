
/*
 * @author wernerla
 * @ William K. Sefton
 * @ CSE271
 * @Date 2/27/18
 * 
 * Purple Robot Child Class
 *  
 * The Purple robots understand prepositions, articles,
 * adjectives, and nouns, and produce one of the following types of phrases
 * 
 * preposition + article + noun
 * preposition + article + adjective + noun
 * 
 * */

public class PurpleRobot extends Robot {
  public PurpleRobot(String name) {
    super(name);
  }
  
  // build a Purple robot phrase
  public String getPhrase() {
    String phrase = null;
    
    // two possible phrases
    int randomType = super.number.nextInt(2); // number is protected so
    // accessible here
    if (randomType == 0) // preposition + article + noun
    {
      phrase = vocab.getRandomPreposition() + " " + vocab.getRandomArticle() +
        " " + vocab.getRandomNoun();
    } else if (randomType == 1)// preposition + article + adjective + noun
    {
      phrase = vocab.getRandomPreposition() + " " + vocab.getRandomArticle() +
        " " + vocab.getRandomAdjective() + " " + vocab.getRandomNoun(); 
    }    
    return phrase;
  }
  
  /*
   * Main method for testing
   */
  public static void main(String[] args) {
    Robot purple = new PurpleRobot("Purple");
    System.out.println("***Testing getName and getPhrase");
    System.out.println(purple.getName());
    System.out.println(purple.getPhrase());
    System.out.println("***Testing with 5 random purple robots, using toString");
    for (int i = 0; i < 5; i++) {
      System.out.println(purple.toString());
      
    }
  }
}

/**
 * ***Testing getName and getPhrase 
Purple 
among her tight birthday 
***Testing with 5 random purple robots, using toString 
Purple says upon your bored viper 
Purple says of his picture 
Purple says like which easy paper 
Purple says of its flower 
Purple says on whichever wandering troop 
*/